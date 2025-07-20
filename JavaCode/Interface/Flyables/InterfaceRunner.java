//Created on 20/07/2025

package intefaceConceptsObjectOriented2_1;

public class InterfaceRunner {

	public static void main(String[] args) {

		Flyable[] flyingObject = { new Bird(), new Aeroplane() };

		for (Flyable object : flyingObject) {
			object.fly();
		}
	}

}
//with wings
//with fuel
