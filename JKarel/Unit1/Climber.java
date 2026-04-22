import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Climber extends Athlete
{
   public Climber()
   {
      super(8, 1, Display.NORTH, 1);
   }
   
   public Climber(int x)
   {
      super(8, 1, Display.NORTH, 1);
   }
   
   public void climbUpRight()
   {
      turnRight();
      move();
      turnLeft();
      move();
      move();
   }
   public void climbUpLeft()
   {
      move();
      move();
      turnLeft();
      move();
      turnRight();
   }
   public void climbDownRight()
   {
      move();
      move();
      turnRight();
      move();
      turnLeft();
   }
      
}
      