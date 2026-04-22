import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Octopus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Octopus extends SmoothMover
{
    /**
     * Act - do whatever the Octopus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 5;
    double dy = 0.1;
    public void act()
    {
        setLocation(getX(), getExactY() + dy);
        dy+=0.1;
        control();
        if(getY() >= 699)
        {
            dy = -6; 
        }
    }
    public void control()
    {
        if(Greenfoot.isKeyDown("Space"))
        {
            setLocation(getX(), getY()-10);
        }
        
    }
}
