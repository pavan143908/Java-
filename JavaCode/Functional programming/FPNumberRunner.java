//created on 26/07/2025

package functional_programming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// numbers.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));

		// sum of numbers
		int t = FpSum(numbers);
		System.out.println(t);

		// sum of even numbers
		int sum = numbers.stream().filter(number -> number % 2 == 0).reduce(0, (number1, number2) -> number1 + number2);

		// int sum1 = Sum(numbers);
		System.out.println(sum);

	}

	private static int FpSum(List<Integer> numbers) {
//		return numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
		return numbers.stream().reduce(0, (number1, number2) -> {
			System.out.println(number1 + " " + number2 + " ");
			return number1 + number2;
		});
	}

	// Sum(numbers);

	private static int Sum(List<Integer> numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}

}
//0 1
//1 2
//3 3
//6 4
//10 5
//15 6
//21 7
//28 8
//36 9
//45 10
//55
//30
