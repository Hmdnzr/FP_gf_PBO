import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class benda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class benda extends Actor
{
    public boolean atWorldEdge()
    {
    if(getX() < 10 || getX() > getWorld().getWidth()-10)
    return true;
    if(getY() < 10 || getY() > getWorld().getHeight()-10)
    return true;    
    else
    return false;
    }
    
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;
    }
    
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if (actor != null) 
        {
            getWorld().removeObject(actor);
        }
    }
}
