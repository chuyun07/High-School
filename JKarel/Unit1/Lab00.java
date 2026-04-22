//Fill in your code in this file.
import edu.fcps.karel2.Display;
import javax.swing.*;
import edu.fcps.karel2.Robot;

public class Lab00
{
    public static void main(String[] args)
    {
              JOptionPane.showConfirmDialog(null, "Click OK to start",
            "Ready to Start?", JOptionPane.DEFAULT_OPTION);
        Display.openWorld("maps/first.map");
        Display.setSize(10, 10);
        Display.setSpeed(1);

        Robot karel = new Robot();

        karel.move();
        karel.pickBeeper();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.putBeeper();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
    }
}