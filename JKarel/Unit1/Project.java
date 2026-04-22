import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Project
{
   public static void main(String[] args)
   {
      String map = JOptionPane.showInputDialog("Which map?");
	   Display.openWorld("maps/" + map + ".map");
		Display.setSize(10, 10);
      Display.setSpeed(10);
      
      
      
   }
}