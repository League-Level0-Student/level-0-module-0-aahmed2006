package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot r2d2 = new Robot();
	r2d2.setSpeed(100);
	r2d2.hide();
	r2d2.penDown();
	r2d2.turn(30);
	r2d2.move(200);
	r2d2.turn(120);
	r2d2.move(200);
	r2d2.turn(180);
	r2d2.move(100);
	r2d2.turn(-60);
	r2d2.move(100);
}
}
