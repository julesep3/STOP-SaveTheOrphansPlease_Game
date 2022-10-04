import greenfoot.*; 

/**
 * 
 * 
 * @author Susan Emberton
 * 
 */
public class ScoreDisplay extends Actor
{    
    public ScoreDisplay(String dis){
        GreenfootImage scoreDis = new GreenfootImage(100,20);
        scoreDis.clear();
        scoreDis.setColor(Color.WHITE);
        Font scoreFont = new Font(true, false, 16);
        scoreDis.setFont(scoreFont);
        scoreDis.drawString("Orphans: " + dis, 0, 18);
        setImage(scoreDis);
        
        
    }

    public void act() 
    {
    }    
}
