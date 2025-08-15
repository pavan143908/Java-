//created on 15/08/2025

package concurrency_concept;

public class ConcurrencyRunner {
	public static void main(String[] args) {

		Counter cnt = new Counter();
		cnt.increment();
		System.out.println(cnt.getI());

	}

}
