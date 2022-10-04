import greenfoot.*;  

/**
 * 
 * 
 * @author Susan Emberton
 * 
 */
public class GameOverDisplay extends Actor
{
    private GreenfootImage finaleImage = new GreenfootImage(1000,1000);

    public GameOverDisplay(){
        Font boardFont = new Font("serif",true, false, 46);
        finaleImage.setFont(boardFont);
        finaleImage.setColor(Color.BLACK);
        finaleImage.drawString("FAILURE!", 120, 120);
        finaleImage.drawString("YOU'RE BANISHED FROM THE CONVENT!", 15, 550);
        finaleImage.setColor(Color.RED);
        finaleImage.drawString("FAILURE!", 118, 120);
        finaleImage.drawString("YOU'RE BANISHED FROM THE CONVENT!", 13, 550);
        setImage(finaleImage);
    }
    
    public void act() 
    {
        
    }     
}