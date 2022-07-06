import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class play extends Actor
{
    
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            getImage().scale((int)Math.round(getImage().getWidth() * 0.9), (int)Math.round(getImage().getHeight() * 0.9));
            
        }
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
