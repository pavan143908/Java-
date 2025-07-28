//created on 28/07/2025

package functional_programming;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Udemy_Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// to return list of odd numbers including negative numbers
		System.out.println(List.of(-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().filter(n -> n % 2 != 0)
				.collect(Collectors.toList()));

		// to return length of string to list
		// .map(e -> e.length())
		System.out.println(List.of("math", "english", "history", "physics").stream().map(String::length)
				.collect(Collectors.toList()));

		// to give cubesof n numbers in alist
		System.out.println(List.of(1, 2, 3, 4, 5).stream().map(n -> (n * n * n)).collect(Collectors.toList()));

		// to retun sum of squares
		System.out.println(List.of(1, 2, 3, 4).stream().mapToLong(n -> n * n).sum());

		// to return maximum value of list of numbers
		// .max((n1, n2) -> Integer.compare(n1, n2))
		System.out.println(List.of(1, 20, 3, 4, 5, 6, 7, 8, 9, 10, 11).stream().filter(e -> e % 2 == 0)
				.max(Integer::compare).orElse(0));

		// alternative to take user input as range.
		System.out.println("enter the number to print the list of cubesuto number:");
		int number = sc.nextInt();
		sc.close();
		System.out.println(IntStream.range(1, number + 1).map(n -> (n * n * n)).boxed().collect(Collectors.toList()));
	}

}
//output

//[-3, -1, 1, 3, 5, 7, 9]
//[4, 7, 7, 7]
//[1, 8, 27, 64, 125]
//30
//20
//enter the number to print the list of cubesuto number:
//20
//[1, 8, 27, 64, 125, 216, 343, 512, 729, 1000, 1331, 1728, 2197, 2744, 3375, 4096, 4913, 5832, 6859, 8000]
