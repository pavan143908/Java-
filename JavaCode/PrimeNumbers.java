//created on 28/07/2035

package functional_programming;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		System.out.println("enter the range of number to print prime numbers:");
		int number = new Scanner(System.in).nextInt();

		for (int i = 2; i <= number; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count <= 2) {
				System.out.print(" " + i);
			}

		}

	}

}
//enter the range of number to print prime numbers:
//100
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97