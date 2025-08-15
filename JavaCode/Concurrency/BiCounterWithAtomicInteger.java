//created on 15/08/2025

package concurrency_concept;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {

	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();

	// class that provide best Thread safe operations
	// AtomicInteger is a class that takes lock responsibility

	public void incrementI() {

		i.incrementAndGet();
	}

	public int getI() {
		return i.get();
	}

	public void incrementJ() {

		j.incrementAndGet();

	}

	public int getJ() {
		return j.get();
	}

}
