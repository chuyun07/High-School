import greenfoot.*;
public class Octopus extends SmoothMover
{
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
