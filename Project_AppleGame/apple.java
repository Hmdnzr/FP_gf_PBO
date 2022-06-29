import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pumpkin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apple extends benda
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
