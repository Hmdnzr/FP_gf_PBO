import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exit extends Actor
{
   
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            getImage().scale((int)Math.round(getImage().getWidth() * 0.9), (int)Math.round(getImage().getHeight() * 0.9));
            
        }
        if (Greenfoot.mouseClicked(this))
        {
            System.exit(0);
        }
    }
}
