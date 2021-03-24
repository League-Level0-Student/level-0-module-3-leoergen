
package _01_else_if._1_robot_color_chooser;
import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		JOptionPane.showInputDialog(null, "what color would you like? Leave empty for random.");
		
		//1. Create a new Robot
		Robot rob = new Robot("batman" );
		Robot rud = new Robot();
		rob.setSpeed(100);
		rud.setSpeed(100);
	    //2. Make the robot draw a shape (this will take more than one line of code)'
		rob.penDown();
		rud.penDown();
		rob.setPenWidth(100);
		for (int i = 0; i < 1000; i++) {
			rob.move(100); 
			rob.turn(100);
			rud.turn(-200);
			rud.move(-200); 
		}
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them


	}
}
