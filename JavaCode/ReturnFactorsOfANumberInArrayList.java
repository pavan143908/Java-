package abcd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReturnFactorsOfANumberInArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to return its factors::");
		int number = sc.nextInt();

		if (number <= 0) {
			System.out.println("number is not valid:" + number);

			return;
		}

		List<Integer> factors = new ArrayList<>();

		// ArrayList<Integer> list = new ArrayList<>();
		// It is not good practice to use ArrayList & use only list ....

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors.add(i);
			}
		}
		sc.close();
		System.out.println(factors);

	}

}
