import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class BoxTopRacer extends Racer
{
   public BoxTopRacer(int y)
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
      while(!rightIsClear())
      {
         move();
      }
      turnRight();
      for(int k = 1; k <= n; k++)
      {
         move();
      }
      turnLeft();
   }
}