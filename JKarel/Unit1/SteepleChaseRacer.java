import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class SteepleChaseRacer extends Racer
{
   public SteepleChaseRacer(int y)
   {
      super(1);
   }
   
   public void jumpRight()
   {
      int n = 0;
      turnLeft();
      while(!rightIsClear() && frontIsClear())
      {
         move();
         n++;
      }
      turnRight();
      move();
      turnLeft();
      for(int k = 1; k <= n; k++)
      {
         move();
      }
      turnLeft();
   }
}