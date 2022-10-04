import greenfoot.*; 

/**
 * 
 * 
 * @author Susan Emberton
 * 
 */
public class Flasher extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("guy_stand_right.png");
    private GreenfootImage img2 = new GreenfootImage("guy_stand_left.png");
    private GreenfootImage img3 = new GreenfootImage("guy_flash1_right.png");
    private GreenfootImage img4 = new GreenfootImage("guy_flash1_left.png");
    public Flasher()
    {
        if(Greenfoot.getRandomNumber(100) > 50)
        {
            setImage(img1);
        }
        else
        {
            setImage(img2);
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
            setLocation(getWorld().getWidth()-1, 610);
        }
        if ((getX() == 999) && (Greenfoot.isKeyDown("left")))
        {
            setLocation( 0, 610);
        }
        flash();
    }  
    
    public void flash()
    {
        if (Greenfoot.getRandomNumber(100) > 95)
        {
            setImage(img3);
        }
        if (Greenfoot.getRandomNumber(100) < 80)
        {
            setImage(img2);
        }
    }       
}
