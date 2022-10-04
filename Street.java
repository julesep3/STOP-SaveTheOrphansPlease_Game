import greenfoot.*;  

/**
 * 
 * 
 * @author Julian Shen
 * 
 */
public class Street extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("road.png");
    public Street()
    {
        setImage(img1);
    }
    
    public void act() 
    {
        MyWorld world = getWorldOfType(MyWorld.class);
        if (Greenfoot.isKeyDown("left") && world.getAtBoundary())
        {
            move(6);
        }
        if (Greenfoot.isKeyDown("right") && world.getAtBoundary())
        {
            move(-6);
        }
    }   
}
