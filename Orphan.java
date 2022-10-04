import greenfoot.*;  

/**
 * 
 * 
 * @author Susan Emberton
 * 
 */
public class Orphan extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("orphan.png");
    private int vertSpd = 0;
    private int accel = 1;   
      
    public Orphan()
    {
        setImage(img1);
    } 
    
    public void act() 
    {
        MyWorld world = getWorldOfType(MyWorld.class);
        checkIfFalling();
        if (Greenfoot.isKeyDown("right") && world.getAtBoundary())
        {
            move(-5);
        }
        if (Greenfoot.isKeyDown("left") && world.getAtBoundary())
        {
            move(5);
        }
        if ((getX() == 0) && (Greenfoot.isKeyDown("right")))
        {
            setLocation( Greenfoot.getRandomNumber(700), 50);
        }
        if ((getX() == 999) && (Greenfoot.isKeyDown("left")))
        {
            setLocation( Greenfoot.getRandomNumber(400), 50);
        }
    }   
    
    public boolean grounded()
    {
        Actor position = getOneObjectAtOffset(0, getImage().getHeight()/2, Street.class);
        return position != null;
    }
    
    public void fall()
    {
        setLocation(getX(), getY() + vertSpd);
        vertSpd = vertSpd + accel;
    }
    
    public void checkIfFalling()
    {
        if (grounded() == false)
        {
            fall();
        }
        if (grounded() == true)
        {
            vertSpd = 0;
        }
    }
}
