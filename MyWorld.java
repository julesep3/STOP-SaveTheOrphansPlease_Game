import greenfoot.*;  

/**
 * 
 * 
 * @author Julian Shen 
 * 
 */
public class MyWorld extends World
{
    private GreenfootSound snd1 = new GreenfootSound("NunMusic.mp3");
    private GreenfootImage img1 = new GreenfootImage("SkyBackground1.jpg");
    private boolean atBoundary;
    private int score = 0;
    private int health = 201;
    
    public MyWorld()
    {    
        super(1000, 747, 1); 
        setBackground(img1); 
        
        addSetting();
        addGameElements();
        addClouds();
        
        addObject( new Orphan(), 10, 50);
        addObject( new Orphan(), 700, 50);
        addObject( new Flasher(), 800, 610);            
        addObject( new Flasher(), 300, 610);
        
        Nun hero = new Nun();
        addObject( hero, 500, 610);
        setPaintOrder(Instructions.class, ScoreDisplay.class, ScoreButton.class, HealthTitle.class, HealthDisplay.class, Neon.class, HealthBar.class, HealthBarBg.class);
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(300)< 2) {
            addObject( new Orphan(), Greenfoot.getRandomNumber(1000), 50);
        }
        snd1.play();
    }
        
    public boolean getAtBoundary()
    {
        return atBoundary;
    }
    
    public int getScore(){
        return score;
    }
    
    public int getHealth(){
        return health;
    }
    
    public GreenfootSound getSnd1(){
        return snd1;
    }
    
    public void setAtBoundary(boolean atBoundary)
    {
        this.atBoundary = atBoundary;
    }
    
    public void setScore(int score)
    {
        this.score = score;
    }
    
    public void setHealth(int health){
        this.health = health;
    }
    
    public void addSetting()
    {
        addObject( new Godzilla(), 999, 500);
        addObject( new CityBackground(), 500, 420);

        addObject( new CityScape(), 500, 520);
        addObject( new Street(), 500, 713);
        addObject( new SaveOrphans(), 500, 420);
        addObject( new BoundaryLeft(), 500, 455);
        addObject( new BoundaryRight(), 500, 455);
        addObject( new Neon(), 500, 375);
        addObject( new Platform(), 200, 475);
        addObject( new Platform(), 700, 475);
        addObject( new Instructions(), 500, 375);
        
    }
    
    public void addGameElements()
    {
        addObject( new ScoreButton(), 850, 150);
        addObject(new ScoreDisplay("0"), 858,151);
        addObject( new HealthDisplay(health),200, 135);
        addObject( new HealthBar(), 200,135);
        addObject( new HealthBarBg(), 197, 136);
        addObject( new HealthTitle(), 500, 373);
    }
    
    public void addClouds()
    {
        for (int i = 0; i < 9; i++)
        {
            addObject( new Cloud(), Greenfoot.getRandomNumber(950), Greenfoot.getRandomNumber(400) );
        }
    }
}
