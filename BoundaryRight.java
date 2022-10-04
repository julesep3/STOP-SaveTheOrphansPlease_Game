import greenfoot.*; 

/**
 * 
 * 
 * @author Julian Shen
 * 
 */
public class BoundaryRight extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("buildingRight.png");
    
    public BoundaryRight()
    {
        setImage(img1);
    }
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(6);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(-6);
        }
    }    
}
