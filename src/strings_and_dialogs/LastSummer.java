package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	String activity = JOptionPane.showInputDialog("What is an activity you like to do?");
	JOptionPane.showMessageDialog(null, "I know that you " + activity + " last summer, " + name + ". Muhahaha!");
}
}
