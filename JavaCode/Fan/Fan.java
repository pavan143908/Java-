// created on 18/07/2025
package oopsLevel2;

public class Fan {

	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;

	public Fan(String make, Double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	/***
	 * public void isOn(boolean isOn) { this.isOn = isOn; }
	 ***/
	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5);

	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	// print the state

	@Override
	public String toString() {
		return String.format("make-%s ,radius-%f, color-%s , isOn -%b ,speed-%d ", make, radius, color, isOn, speed);
	}

}
