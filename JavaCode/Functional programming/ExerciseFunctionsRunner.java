//created on 26/07/2025

package functional_programming;

import java.util.List;
import java.util.stream.IntStream;

public class ExerciseFunctionsRunner {

	public static void main(String[] args) {

		// List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

		// List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().map(e -> e * e).forEach(e ->
		// System.out.println(e));

		IntStream.range(1, 11).map(p -> p * p).forEach(p -> System.out.println(p));

		List.of("Apple", "Ant", "Bat").stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));

		List.of("Apple", "Ant", "Bat").stream().map(e -> e.length()).forEach(e -> System.out.println(e));
	}

}

//output
//1
//4
//9
//16
//25
//36
//49
//64
//81
//100
//apple
//ant
//bat
//5
//3
//3