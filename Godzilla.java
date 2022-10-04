import greenfoot.*;  

/**
 * 
 * 
 * @author Julian Shen
 * 
 * 
 */
public class Godzilla extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("godzillaSilhouette1.png");
    private GreenfootSound choir = new GreenfootSound("choir4.mp3");
    private GreenfootSound lose = new GreenfootSound("lose.wav");
    private GreenfootSound winSound = new GreenfootSound("kidscheering.wav");
    public Godzilla()
    {
        setImage(img1);
    }
    
    public void act() 
    {
        if (Greenfoot.getRandomNumber(100) < 15)
        {
            move(-2);
            timer();
        }
    }    
    
    public void timer()
    {
        MyWorld world = getWorldOfType(MyWorld.class);
        if (getX() == 0)
        {
            if(world.getScore() > 20){
                winSound.play();
                world.getSnd1().stop();
                Greenfoot.stop();
                world.addObject(new Finale(), 500, 360);
                world.addObject(new FinaleDisplay(), 500, 420);
                world.addObject(new yayKids(), 660, 320);
                world.addObject(new yayNun(), 440, 360);                
                world.setPaintOrder(FinaleDisplay.class, yayKids.class, yayNun.class, ScoreDisplay.class, ScoreButton.class, Finale.class);
                choir.play();
            }
            else
            {
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
    }
}
