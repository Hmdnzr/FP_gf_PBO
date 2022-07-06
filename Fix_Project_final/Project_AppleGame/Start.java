import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    
    public Start()
    {    
        super(720, 400, 1); 
        prepare();
    }
    
    private void prepare() {
        play play = new play();
        addObject(play,375,300);
        exit exit = new exit();
        addObject(exit,500,300);
        apple apel = new apple();
        addObject(apel,287,19);
        apple pumpkin2 = new apple();
        addObject(pumpkin2,425,31);
        removeObject(apel);
        removeObject(pumpkin2);
    }
}
