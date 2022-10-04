import greenfoot.*;  

/**
 * 
 * 
 * @author Susan Emberton
 *
 */
public class HealthBar extends Actor
{
    private GreenfootImage bar = new GreenfootImage(200,30);
    
    public HealthBar(){
        bar.drawRect(0, 0, 200, 10);
        bar.setColor(Color.WHITE);
        bar.fill();
        setImage(bar);
        
    }
    
    public void act() 
    {
        
    }    
}
