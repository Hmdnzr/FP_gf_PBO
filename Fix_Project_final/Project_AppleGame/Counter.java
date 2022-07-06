import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private int totalcount = 0;
    
    public void act()
    {
        gameOver();// Add your action code here.
    }
    
    public Counter(){
        setImage(new GreenfootImage("0", 30, Color.WHITE, Color.BLUE));
    }
    
    public void Counting (int hitung)
    {
        totalcount += hitung;
        setImage(new GreenfootImage("" + totalcount, 30, Color.WHITE, Color.BLUE));
    
    }
    
    public void gameOver()
    {
        if (totalcount >= 50)
        {
            Greenfoot.stop();
            Greenfoot.playSound("Menang.mp3");
            System.out.println("Selamat anda menang game ini !!!! click reset untuk bermain lagi");
            
        }
    }
}
