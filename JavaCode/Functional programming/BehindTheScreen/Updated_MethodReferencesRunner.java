//created on 27/07/2025

package functional_programming;

import java.util.List;
import java.util.function.Predicate;

public class Updated_MethodReferencesRunner {

	public static void print(Integer n) {
		System.out.println(n);
	}

	public static void main(String[] args) {

		List<String> animal = List.of("Ant", "Bat", "cat", "Dog", "Elephant");

		animal.stream().map(s -> s.length()).forEach(s -> System.out.println(s));

		System.out.println("******");

		animal.stream().map(s -> s.length()).forEach(System.out::println);

		System.out.println("******");

		animal.stream().map(String::length).forEach(Updated_MethodReferencesRunner::print);

		System.out.println("******");

		Predicate<? super Integer> eventPredicate = createEventPredicate();

		List.of(25, 31, 45, 81, 74).stream().filter(eventPredicate).max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);

		// List.of(25,31,45,81,74).stream().filter(n->n%2==0).max((n1,n2)->Integer.compare(n1,n2)).orElse(0)

		int max = List.of(25, 31, 45, 81, 74).stream().filter(Updated_MethodReferencesRunner::IsEven)
				.max(Integer::compare).orElse(0);

		System.out.println(max);

	}

	private static Predicate<? super Integer> createEventPredicate() {
		return n -> n % 2 == 0;
	}
//n -> n % 2 == 0 to IsEven

//(n1, n2) -> Integer.compare(n1, n2) to Integer::compare

// s -> s.length() to String::length

	public static boolean IsEven(Integer i) {
		return i % 2 == 0;
	}
}