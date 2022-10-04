import greenfoot.*;  
import java.util.List;
/**
 * 
 * 
 * @author Susan Emberton
 * 
 */
public class Nun extends Actor
{
    private int vertSpd = 0;
    private int accel = 1;
    private int jump = -23;
    private int score = 0;
    
    private GreenfootImage nunRight = new GreenfootImage("nun_right.png");
    private GreenfootImage nunLeft = new GreenfootImage("nun_left.png");
    private GreenfootImage nunRightShock = new GreenfootImage("nun_shock_right.png");
    private GreenfootImage nunLeftShock = new GreenfootImage("nun_shock_left.png");
    private GreenfootSound scream = new GreenfootSound("Wilhelm-Scream.mp3");
    private GreenfootSound lose = new GreenfootSound("lose.wav");
    private GreenfootSound ah1 = new GreenfootSound("ahh1.wav");
    private GreenfootSound ah2 = new GreenfootSound("ahh2.wav");
    private GreenfootSound ah3 = new GreenfootSound("ahh3.wav");
    private GreenfootSound ah4 = new GreenfootSound("ahh4.wav");
    private GreenfootSound ah5 = new GreenfootSound("ahh5.wav");
    private GreenfootSound ah6 = new GreenfootSound("ahh6.wav");
    private GreenfootSound ah7 = new GreenfootSound("ahh7.wav");
    private GreenfootSound ah8 = new GreenfootSound("ahh8.wav");

    public Nun()
    {
        setImage(nunRight);
    }
    
    public void act() 
    {
        mover();
        checkIfFalling();
        checkAtBoundary();
        orphanCollect();
        flasherCollide();
    }    
        
    public void mover()
    {
        MyWorld world = getWorldOfType(MyWorld.class);
        if (Greenfoot.isKeyDown("right"))
        {
            move(6);
            setImage(nunRight);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            move(-6);
            setImage(nunLeft);
        }
        if (Greenfoot.isKeyDown("space") && grounded() && !platformed())
        {
            vertSpd = jump;
            fall();
        }
        if (Greenfoot.isKeyDown("space") && platformed())
        {
            vertSpd = jump;
            fall();
        }
        if (Greenfoot.isKeyDown("up") && grounded())
        {
            vertSpd = jump;
            fall();
        }
        if (Greenfoot.isKeyDown("up") && platformed())
        {
            vertSpd = jump;
            fall();
        }
    }
    
    public void checkIfFalling()
    {
        if ((grounded() == false) && (platformed() == false))
        {
            fall();
        }
        if (grounded() && platformed())
        {
            vertSpd = 0;
        }
    }
    
    public boolean grounded()
    {
        Actor position = getOneObjectAtOffset(0, getImage().getHeight()/2, Street.class);
        return position != null;
    }
    
    public boolean platformed()
    {
        Actor position = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
        return position != null;
    }
    
    public void fall()
    {
        setLocation(getX(), getY() + vertSpd);
        vertSpd = vertSpd + accel;
    }
    
    public void checkAtBoundary()
    {
        MyWorld world = getWorldOfType(MyWorld.class);
        if (isAtEdge())
        {
            world.setAtBoundary(false);
        }
        else if ((getX() >= 1) && Greenfoot.isKeyDown("right"))
        {
            world.setAtBoundary(true);
        }
        else if ((getX() <= 999) && Greenfoot.isKeyDown("left"))
        {
            world.setAtBoundary(true);
        }
    }
    
    public void orphanCollect(){
        Orphan orphan = (Orphan)getOneIntersectingObject(Orphan.class);
        MyWorld world = getWorldOfType(MyWorld.class);
        if(isTouching(Orphan.class)){
            removeTouching(Orphan.class);
            int i = world.getScore();
            world.setScore(i + 1);
            List scoreList = world.getObjects(ScoreDisplay.class);
            world.removeObjects(scoreList);
            String scoreValue = String.valueOf(world.getScore());
            world.addObject(new ScoreDisplay(scoreValue), 858,151);
            scoreSound();
        }
    }
    
    public void flasherCollide(){
        Flasher flasher = (Flasher)getOneIntersectingObject(Flasher.class);
        MyWorld world = getWorldOfType(MyWorld.class);
        if(isTouching(Flasher.class) && (world.getHealth() > 1)){
            int i = world.getHealth();
            world.setHealth(i - 10);
            i = world.getHealth();

            List healthList = world.getObjects(HealthDisplay.class);
            world.removeObjects(healthList);
            world.addObject(new HealthDisplay(i), 100 + (i / 2), 135); 
            
            
            if(getX() > flasher.getX()){
                setImage(nunLeftShock);
                setLocation(flasher.getX() + 100, getY());
            }
            else{
                setImage(nunRightShock);
                setLocation(flasher.getX() - 100, getY());
            }
            
            scream.play();
            
        }
        if(world.getHealth() == 1){
            world.getSnd1().stop();
            Greenfoot.stop();
            lose.play();
            world.addObject(new Finale(), 500, 360);
            world.addObject(new NunLose(), 500, 370);
            world.addObject(new GameOverDisplay(), 500, 555);
            world.addObject(new NunLoseOrphans(), 510, 250);
            world.setPaintOrder(GameOverDisplay.class, NunLose.class, NunLoseOrphans.class, Finale.class);
        }
    }
    public void scoreSound(){
        MyWorld world = getWorldOfType(MyWorld.class);
        if(world.getScore() < 4){
            ah1.play();
        }else if(world.getScore() < 7){
            ah2.play();
        }else if(world.getScore() < 10){
            ah3.play();
        }else if(world.getScore() < 13){
            ah4.play();
        }else if(world.getScore() < 16){
            ah5.play();
        }else if(world.getScore() < 19){
            ah6.play();
        }else if(world.getScore() < 22){
            ah7.play();
        }else if(world.getScore() >= 22){
            ah8.play();
        }
    }
}

    
    

