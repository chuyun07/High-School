import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor
{
    private int gravity = 5;
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Food()
    {
        double randNum = Math.random();
        if(randNum < 0.16666){
            setImage("food1.png");
        }
        else if(randNum == 0)
        {
            setImage("food0.png");
        }
        else if(randNum > 0.33332)
        {
            setImage("food2.png");
        }
        else if(randNum > 0.49998)
        {
            setImage("food3.png");
        }
        else if(randNum > 0.66664)
        {
            setImage("food4.png");
        }
        else if(randNum > 0.8333)
        {
            setImage("food5.png");
        }
    }
    public void act()
    {
        int randomNumber = 0;
        {
            if(randomNumber == 0)
            {
                getWorld().addObject(new Food(), Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
            }
        }
        if (isTouching(Turtle.class))
        {
            getWorld().removeObject(this);
        }
        setLocation(getX(), getY()+gravity);
       
        
    }
}
