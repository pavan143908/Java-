//created on 26/07/2025

package functional_programming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {

		List<String> list = List.of("Apple", "Banana", "Coconut", "Dragonfruit");
		// printString(list);
		// printWithFiltering(list);
		// printWithFP(list);
		printWithFPWithFiltering(list);

	}

	private static void printString(List<String> list) {
		for (String string : list) {

			System.out.println(string);
		}
//output for printString(list);
// Apple
// Banana
// Coconut
//Dragonfruit

	}

	private static void printWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("t")) {
				System.out.println(string);
			}
		}
// output for printWithFiltering(list);
//Coconut
//Dragonfruit

	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("element- " + element));

// output for printWithFP(list);
//		element- Apple
//		element- Banana
//		element- Coconut
//		element- Dragonfruit

	}

	private static void printWithFPWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("t"))
				.forEach(element -> System.out.println("element- " + element));
	}
//output for printWithFPWithFiltering(list);
//element- Coconut
//element- Dragonfruit
}
