//created on 26/07/2025

package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardInGenerics {
	// wildCard in Generics

	static double sumOfNumberList(List<? extends Number> numbers) {// upperBound wildCard
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	static void addACoupleOfValues(List<? super Number> numbers) {// lowerBound wildCard
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);

	}

	public static void main(String[] args) {
		List<Number> al = new ArrayList<Number>();// creating a list of ArrayList of empty al
		addACoupleOfValues(al);// adding the data present in method "addACoupleOfValues" to al
		System.out.println(al);// printing the al List

		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5))); // Integer type
		System.out.println(sumOfNumberList(List.of(1.0, 2.5, 3.5, 4.6, 5.5))); // float
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l))); // long

	}

}

//output
//[1, 1.0, 1.0, 1]
//15.0
//17.1
//15.0
