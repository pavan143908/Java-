// created on 18/07/2025
package oopsLevel2;

public class FanRunner {

	public static void main(String[] args) {

		Fan fan = new Fan("manufacturer_1", 0.2356, "red");

		fan.switchOn();
		System.out.println(fan);

		fan.setSpeed((byte) 3);
		System.out.println(fan);

		fan.switchOff();
		System.out.println(fan);

	}

}
/***
 * make-manufacturer_1 ,radius-0.235600, color-red , isOn -true ,speed-5
 * make-manufacturer_1 ,radius-0.235600, color-red , isOn -true ,speed-3
 * make-manufacturer_1 ,radius-0.235600, color-red , isOn -false ,speed-0
 *
 ***/