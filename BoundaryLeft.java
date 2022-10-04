import greenfoot.*;  

/**
 * 
 * 
 * @author Julian SHen 
 * 
 */
public class BoundaryLeft extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("buildingLeft.png");
    
    public BoundaryLeft()
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
