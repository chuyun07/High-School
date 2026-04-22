import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Cleaner extends Athlete
{
   public Cleaner()
   {
      super();
   }
   
   public Cleaner(int x, int y)
   {
      super(x, y, Display.NORTH, 0);
   }
   
   public void organise()
   {
      if(frontIsClear())
      {
         move();
         while(nextToABeeper())
         {
            pickBeeper();
         }
         putBeeper();
      }
      else if(!frontIsClear())
      {
         turnAround();
      }
   }
   
      
}