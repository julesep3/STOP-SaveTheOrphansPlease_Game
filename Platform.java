import greenfoot.*;  

/**
 * 
 * 
 * @author Julian Shen
 * 
 */
public class Platform extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("platform1.png");
    private GreenfootImage img2 = new GreenfootImage("platform2.png");
    
    public Platform()
    {
        if (Greenfoot.getRandomNumber(100) < 49)
        {
            setImage(img2);
        }
        else
        {
            setImage(img1);
        }
    }
  
    public void act() 
    {
        MyWorld world = getWorldOfType(MyWorld.class);
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
            setLocation(getWorld().getWidth()-1, 475);
        }
        if ((getX() == 999) && (Greenfoot.isKeyDown("left")))
        {
            setLocation( 0, 475);
        }
    }    
}
