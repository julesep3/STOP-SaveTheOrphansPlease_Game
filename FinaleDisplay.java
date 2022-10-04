import greenfoot.*;  

/**
 * 
 * 
 * @author Susan Emberton
 * 
 */
public class FinaleDisplay extends Actor
{
    private GreenfootImage finaleImage = new GreenfootImage(1000,747);

    public FinaleDisplay(){
        MyWorld world = getWorldOfType(MyWorld.class);
        Font boardFont = new Font("serif",true, false, 50);
        finaleImage.setFont(boardFont);
        finaleImage.setColor(Color.BLUE);
        finaleImage.drawString("CONGRATULATIONS!", 150, 70);
        finaleImage.drawString("YOU'RE NUN OF THE MONTH!", 125, 580);
        finaleImage.setColor(Color.YELLOW);
        finaleImage.drawString("CONGRATULATIONS!", 148, 70);
        finaleImage.drawString("YOU'RE NUN OF THE MONTH!", 123, 580);        
        setImage(finaleImage);
    }
    
    public void act() 
    {
        
    }  
}