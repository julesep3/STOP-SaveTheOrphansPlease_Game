import greenfoot.*;  

/**
 * 
 * 
 * @author Julian Shen
 * 
 */
public class CityScape extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("City1.png");
    
    public CityScape()
    {
        setImage(img1);
    }
    
    public void act() 
    {
        MyWorld world = getWorldOfType(MyWorld.class);
        if (Greenfoot.isKeyDown("left") && world.getAtBoundary())
        {
            move(3);
        }
        if (Greenfoot.isKeyDown("right") && world.getAtBoundary())
        {
            move(-3);
        }
    }    
}
