import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Lab10
{
  public static void main(String[] args)
  {
      String map = JOptionPane.showInputDialog("Which map?");
	   Display.openWorld("maps/" + map + ".map");
		Display.setSize(10, 10);
      Display.setSpeed(10);
      
      Athlete karel = new Athlete();
      
      while(!karel.nextToABeeper())
      {
         if(karel.leftIsClear())
         {
            karel.turnLeft();
            karel.move();
         }
         else if(karel.frontIsClear())
         {
            karel.move();
         }
         else if(karel.rightIsClear())
         {
            karel.turnRight();
            karel.move();
         }
         else
         {
            karel.turnAround();
            karel.move();
         }
        
         // while(!karel.leftIsClear() && karel.frontIsClear())
//          {
//             karel.move();
//             if(karel.rightIsClear())
//             {
//                karel.turnRight();
//                karel.move();
//             }
//             if(karel.leftIsClear())
//             {
//                karel.turnLeft();
//                karel.move();
//             }
//             if(!karel.frontIsClear() && karel.rightIsClear())
//             {
//                karel.turnRight();
//             }
//             if(!karel.frontIsClear() && karel.leftIsClear())
//             {
//                karel.turnLeft();
//             }
//             if(!karel.frontIsClear() && !karel.leftIsClear() && karel.rightIsClear())
//             {
//                karel.turnLeft();
//             }
//             if(!karel.frontIsClear() && !karel.rightIsClear() && !karel.leftIsClear())
//             {
//                karel.turnAround();
//             }
//          }
//          while(karel.leftIsClear() && karel.frontIsClear())
//          {
//             karel.move();
//             if(karel.leftIsClear())
//             {
//                karel.turnLeft();
//                karel.move();
//             }
//             if(karel.rightIsClear())
//             {
//                karel.turnRight();
//                karel.move();
//             }
//             if(!karel.frontIsClear() && karel.leftIsClear())
//             {
//                karel.turnLeft();
//             }
//             if(!karel.frontIsClear() && karel.rightIsClear())
//             {
//                karel.turnRight();
//             }
//          }
      }   
   }
}