import greenfoot.*;  

/**
 * 
 * 
 * @author Julian Shen
 * 
 */
public class Cloud extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("cloud.png");
    public Cloud()
    {
        setImage(img1);
    }
    
    public void act() 
    {
        MyWorld world = getWorldOfType(MyWorld.class);
        move(2);
        
        if (getX() == 999) 
        {
            setLocation( 0, Greenfoot.getRandomNumber (300) + 25);
        }
    }    
}
