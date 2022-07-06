import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 430, 1);
        pumpkinjatuh();
        siap();
        bomjatuh();
        prepare();
    }
    
    public void act() {
        if (getObjects(apple.class).isEmpty()) 
        {
        pumpkinjatuh();
        }
        if (getObjects(bomb.class).isEmpty()) 
        { 
        bomjatuh(); 
        }
    }
    
    private void siap(){
        kereta kereta = new kereta();
        addObject(kereta, 648,403);
        Counter Counter = new Counter(); 
        addObject(Counter, 57, 69);
        nilai nilai = new nilai();
        addObject(nilai, 64, 44);
        nilai.setLocation(75, 35);
        kereta.setLocation(373, 403);
        
    }
    
public void pumpkinjatuh() {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new apple(), Greenfoot.getRandomNumber(519),10);
            addObject(new apple2(), Greenfoot.getRandomNumber(519),20);
            addObject(new apple3(), Greenfoot.getRandomNumber(519),30);
        }
    }
    
    public void bomjatuh(){
    if (Greenfoot.getRandomNumber(2) < 50) 
    {
        addObject(new bomb(), Greenfoot.getRandomNumber(519),11);
        addObject(new bomb2(), Greenfoot.getRandomNumber(519),21);
    }
    }
    
    private void prepare()
    {

        apple3 apple3 = new apple3();
        addObject(apple3,316,31);
        apple2 apple2 = new apple2();
        addObject(apple2,121,8);
        bomb2 bomb2 = new bomb2();
        addObject(bomb2,461,35);
    }
}
