import edu.fcps.karel2.Display;
import javax.swing.*;
import edu.fcps.karel2.Robot;

public class Lab02
{
   public static void main(String[] args)
   {
      JOptionPane.showConfirmDialog(null, "Click OK to start",
            "Ready to Start?", JOptionPane.DEFAULT_OPTION);
      Display.openWorld("maps/maze.map");
      Display.setSize(8,8);
   
      Athlete karel = new Athlete();
      
      karel.putBeeper();
      karel.move();
      karel.putBeeper();
      karel.turnRight();
      karel.move();
      karel.putBeeper();
      karel.turnRight();
      karel.move();
      karel.turnLeft();
      karel.putBeeper();
      karel.move();
      karel.putBeeper();
      karel.turnLeft();
      karel.move();
      karel.putBeeper();
      karel.turnRight();
      karel.move();
      karel.putBeeper();
      karel.move();
      karel.putBeeper();
      karel.turnRight();
      karel.move();
      karel.putBeeper();
      karel.turnLeft();
      karel.move();
      karel.putBeeper();
      karel.turnLeft();
      karel.move();
      karel.putBeeper();
      karel.move();
      karel.putBeeper();
      karel.move();
      karel.putBeeper();
      karel.move();
      karel.putBeeper();
      karel.turnRight();
      karel.move();
      karel.putBeeper();
      karel.move();
   }
}
