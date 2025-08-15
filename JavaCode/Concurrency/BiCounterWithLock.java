//created on 15/08/2025

package concurrency_concept;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;

	Lock lockforI = new ReentrantLock();
	Lock lockforJ = new ReentrantLock();

	public void incrementI() {

		lockforI.lock();
		// get lock for i
		i++;
		lockforI.unlock();
		// release lock for i
	}

	public int getI() {
		return i;
	}

	public void incrementJ() {

		lockforJ.lock();

		// get lock for j

		j++;
		lockforJ.unlock();

		// release lock for j

	}

	public int getJ() {
		return j;
	}

}
