import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kereta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kereta extends benda
{
    /**
     * Act - do whatever the kereta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound bg= new GreenfootSound("backsound.mp3");
    public void act()
    {
        bg.playLoop();
        
        moveKereta();
        objectDisappear();
    }
    
    public void objectDisappear()
    {
        if (canSee(apple.class))
        {
            eat(apple.class);
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10);
            Greenfoot.playSound("skor.mp3");
            
        }
    }
    public void moveKereta()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-10);
        }
        if (Greenfoot.isKeyDown("Right"))
        {
            move(+10);
        }
    }
}
