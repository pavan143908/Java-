//created on 15/08/2025

package concurrency_concept;

public class Counter {
	int i = 0;

	synchronized public void increment() {
		i++;
	}

	public int getI() {
		return i;
	}

}
