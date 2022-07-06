import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb2 extends bomb
{
     public void act()
    {
        setLocation(getX(), getY()+5);
        meledak();
    }
    
    public void meledak() 
    {
        if (canSee(kereta.class))
        {
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(-2);
            Greenfoot.playSound("Punch.mp3");
        }   
        
        if (atWorldEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
