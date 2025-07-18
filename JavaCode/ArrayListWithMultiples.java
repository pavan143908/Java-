package abcd;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithMultiples {

	public static void main(String[] args) {

		List<Integer> multiples = new ArrayList<>();

		int number = 3;// number = 3; limit = 20; the ouyput is [3, 6, 9, 12, 15, 18]
		int limit = 20;// number = 5; limit = 1; the ouyput is[]

		if (number < 0 || limit <= 0) {
			System.out.println(multiples);
			return;
		}

		for (int i = 1; i < limit; i++) {
			if (i % number == 0) {
				multiples.add(i);

			}
			/***
			 * a other alternative ::for (int i = 1; i * number < limit; i++) {
			 *
			 * multiples.add(number * i);
			 *
			 * }
			 ***/
		}

		System.out.println(multiples);
	}

}
