package week1.day2;

public class car {
public void applyBreak() {
	System.out.println("Press Brake");
}

public void applyGear() {
	System.out.println("Gear1");
}

public void switchOnAC() {
	System.out.println("Press AC button, Fan speed 2 ");
}

public void applyAccelerator() {
	System.out.println("Gently apply accelator and release clutch");
}

public static void main(String[] args) {
	car c = new car();
	c.applyAccelerator();
	c.applyBreak();
	c.applyGear();
	c.switchOnAC();
}
}