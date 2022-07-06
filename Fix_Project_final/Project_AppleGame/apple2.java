import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apple2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apple2 extends apple
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
