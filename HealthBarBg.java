import greenfoot.*;  

/**
 * 
 * 
 * @author Susan Emberton
 * 
 */
public class HealthBarBg extends Actor
{
    private GreenfootImage bar1 = new GreenfootImage(235, 60);
    public HealthBarBg(){
        bar1.drawRect(175, 105, 235, 60);
        bar1.setColor(Color.DARK_GRAY);
        bar1.fill();
        setImage(bar1);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
