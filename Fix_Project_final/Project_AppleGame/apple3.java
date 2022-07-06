import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apple3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apple3 extends apple2
{
     private int timer = 0;
    
    public void act()
    {
        setLocation(getX(), getY()+6);
        PumpkinFall();
        
    }
    
    public void PumpkinFall()
    {
        if (atWorldEdge())
        {
            getWorld().removeObject(this);
            Greenfoot.playSound("Pop.mp3");
        }
    }
}
