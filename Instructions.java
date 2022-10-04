import greenfoot.*;  
import java.util.List;
/**
 * 
 * 
 * @author Julian Shen
 * 
 */
public class Instructions extends Actor
{
    private GreenfootImage healthImage = new GreenfootImage(1000,747);
    
    public Instructions()
    {
        Font boardFont = new Font("serif",true, false, 36);
        healthImage.setFont(boardFont);
        healthImage.setColor(Color.WHITE);
        healthImage.drawString("Avoid the strangers...", 127, 220);
        healthImage.drawString("Save at least 20 orphans...", 127, 260);
        healthImage.drawString("before Godzilla reaches the west side of town...", 127, 300);
        healthImage.drawString("(use arrow keys to move and 'space bar' to jump)", 127, 340);       
        healthImage.setColor(Color.BLACK);
        healthImage.drawString("Avoid the strangers...", 125, 220);
        healthImage.drawString("Save at least 20 orphans...", 125, 260);
        healthImage.drawString("before Godzilla reaches the west side of town...", 125, 300);
        healthImage.drawString("(use arrow keys to move and 'space bar' to jump)", 125, 340);
        setImage(healthImage);
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
