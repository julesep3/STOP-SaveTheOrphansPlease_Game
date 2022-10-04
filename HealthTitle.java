import greenfoot.*;  

/**
 * 
 * 
 * @author Susan Emberton
 * 
 */
public class HealthTitle extends Actor
{
    private GreenfootImage healthImage = new GreenfootImage(1000,747);
    
    
    public HealthTitle()
    {
        Font boardFont = new Font("serif",true, false, 22);
        healthImage.setFont(boardFont);
        healthImage.setColor(Color.BLACK);
        healthImage.drawString("Health Bar", 140, 141);        
        healthImage.setColor(Color.WHITE);
        healthImage.drawString("Health Bar", 138, 141);
        setImage(healthImage);
    }
    
    public void act() 
    {
        
    }    
}
