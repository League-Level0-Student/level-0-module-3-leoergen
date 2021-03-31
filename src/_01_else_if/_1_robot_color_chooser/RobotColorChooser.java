
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
			
		
		//1. Create a new Robot
		Robot rob = new Robot("mini");
		
		for (int i = 0; i < 50; i++) {
	    //2. Make the robot draw a shape (this will take more than one line of code)	
		//3. Set the pen width to 10
		rob.setPenWidth(100);
		
		rob.penDown();
		//4. Ask the user what color pen they would like the robot to draw with
		String clr = JOptionPane.showInputDialog(null, "what colo(u)r would you like?");
		
		//5. Use an if/else statement to set the pen color that the user requested
		if (clr.equals("red")) {
			rob.setPenColor(Color.red);
		}
		
		else if (clr.equals("yellow")) {
			rob.setPenColor(Color.yellow);
		}
		
		else if (clr.equals("orange")) {
			rob.setPenColor(Color.orange);
		}
		
		else if (clr.equals("green")) {
			rob.setPenColor(Color.green);
		}
		
		else if (clr.equals("blue")) {
			rob.setPenColor(Color.blue);
		}
		
		else if (clr.equals("pink")) {
			rob.setPenColor(Color.pink);
		}
		
		else if (clr.equals("black")) {
			rob.setPenColor(Color.black);
		}
        //6. If the user doesn't enter anything, choose a random color
		else {
		rob.setRandomPenColor();
		}
		rob.setSpeed(100);
		rob.move(50);
		rob.turn(-111);
		rob.move(50);
		rob.turn(-11);
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		}

		



	}
}
