import greenfoot.*;  
import java.util.List;
/**
 * 
 * 
 * @author Julian Shen
 * 
 */
public class SaveOrphans extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("saveOrphan.png");
    
    public SaveOrphans()
    {
        setImage(img1);
    }
    
    public void act() 
    {
        setLocation(getX(), getY() - 1);
        if(getY() == 0)
        {
            World world = getWorld();
            List list = world.getObjects(SaveOrphans.class);
            world.removeObjects(list);
        }
    }    
}
