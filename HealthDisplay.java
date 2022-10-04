import greenfoot.*;  

/**
 * 
 * 
 * @author Susan Emberton
 * 
 */
public class HealthDisplay extends Actor
{
    
    public HealthDisplay(int x){
        GreenfootImage displayBar = new GreenfootImage(x, 30);
        displayBar.drawRect(0,0, x ,10);
        displayBar.setColor(Color.RED);
        displayBar.fill();
        setImage(displayBar);
        

    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
