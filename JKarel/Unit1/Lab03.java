import edu.fcps.karel2.Display;
import javax.swing.*;
import edu.fcps.karel2.Robot;

public class Lab03
{
   public static void main(String[] args)
   {
      JOptionPane.showConfirmDialog(null, "Click OK to start",
            "Ready to Start?", JOptionPane.DEFAULT_OPTION);
      Display.openWorld("maps/mountain.map");
      Display.setSize(16,16);
      
      Climber ashe = new Climber();
      
      ashe.climbUpRight();
      ashe.climbUpRight();
      ashe.climbUpRight();
      ashe.turnRight();
      ashe.move();
      ashe.move();
      ashe.turnRight();
      ashe.move();
      ashe.move();
      ashe.turnLeft();
      ashe.move();
      ashe.turnRight();
      ashe.move();
      ashe.move();
      ashe.pickBeeper();
      ashe.turnAround();
      ashe.climbUpLeft();
      ashe.climbUpLeft();
      ashe.turnLeft();
      ashe.move();
      ashe.turnLeft();
      ashe.climbDownRight();
      ashe.climbDownRight();
      ashe.move();
      ashe.move();
      ashe.turnRight();
      ashe.move();
    }
}