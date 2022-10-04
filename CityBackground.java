import greenfoot.*;  

/**
 * 
 * 
 * @author Julian Shen
 * 
 */
public class CityBackground extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("City3.png");
    
    public CityBackground()
    {
        setImage(img1);
    }
    
    /**
     * Act - do whatever the CityBackground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld world = getWorldOfType(MyWorld.class);
        if (Greenfoot.isKeyDown("left") && world.getAtBoundary())
        {
            move(2);
        }
        if (Greenfoot.isKeyDown("right") && world.getAtBoundary())
        {
            move(-2);
        }
        /*
        if (getX() == 0)
        {
            setLocation(getWorld().getWidth()-1, 420);
        }
        if (getX() == 1000)
        {
            setLocation(0, 420);
        }
        */
    }    
}
