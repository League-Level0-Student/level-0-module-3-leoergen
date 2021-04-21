package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class areYouhHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String h= JOptionPane.showInputDialog("Are you happy?");
if(h.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Good!");
}
if (h.equals("no")) {
	String s= JOptionPane.showInputDialog("do you want to be happy?");
	if(s.equals("yes")) {
		JOptionPane.showMessageDialog(null, "try changing soomething");
	}
	if(s.equals("no")) {
		JOptionPane.showMessageDialog(null, "Good!");
	}
}

	}

}
