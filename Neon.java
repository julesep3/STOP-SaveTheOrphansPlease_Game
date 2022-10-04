import greenfoot.*;  

/**
 * 
 * 
 * @author Julian Shen
 * 
 */
public class Neon extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("neon.png");
    
    public Neon()
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
