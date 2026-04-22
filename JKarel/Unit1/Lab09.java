import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;  
import javax.swing.JOptionPane;

public class Lab09 {
	 
	 public static void main(String[] args) {
		 
       String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/" + map + ".map");
		 Display.setSize(10, 10);
		 Display.setSpeed(10);
       
       Athlete ashe = new Athlete(1, 1, Display.EAST, 0);
		 
       ashe.move();
       ashe.move();
       ashe.move();
       ashe.move();
       ashe.move();
       ashe.move();
       
       for (int i = 1; i <= 7; i++) {
       int count = 0;
       while (ashe.nextToABeeper())
      {
       ashe.pickBeeper();
       count++;
      }
       ashe.move();
       for (int k = 1; k <= count; count--)
      {
       ashe.putBeeper();
      }
      ashe.turnAround();
       if (ashe.frontIsClear()) 
      {
       ashe.move();
      }
       if (ashe.frontIsClear()) 
      {
       ashe.move();
      }
       ashe.turnAround();
     }
       ashe.turnAround();
     
  }
}