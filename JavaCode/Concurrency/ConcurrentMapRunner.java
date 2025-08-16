//created on 16/08/2025

package concurrency_concept;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {

		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();

		String str = "ABCD ABCD ABCD";

		for (char character : str.toCharArray()) {
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
//			LongAdder longAdder = occurances.get(character);
//			if (longAdder == null) {
//				longAdder = new LongAdder();
//
//			}
//			longAdder.increment();
//			occurances.put(character, longAdder);

		}
		System.out.println(occurances);
	}
}

// OUTPUT
//{ =2, A=3, B=3, C=3, D=3}
