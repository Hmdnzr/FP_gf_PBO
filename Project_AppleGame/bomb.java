import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends benda
{
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+5);
        meledak();
    }
    
    public void meledak() 
    {
        if (canSee(kereta.class))
        {
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(-1);
            Greenfoot.playSound("Punch.mp3");
        }   
        
        if (atWorldEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
