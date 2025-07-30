//created on 30/07/2025

package exception.handling;

import java.util.Scanner;

public class FinallyRunner {
	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);

			int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			int number = numbers[10];

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(" before Scanner close");
			if (sc != null) {

				sc.close();
			}
		}

		System.out.println("just before  closing  out main ");

	}
}
//output

/*
 * java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 9
 * at
 * Exception_Handling/exception.handling.FinallyRunner.main(FinallyRunner.java:
 * 13) before Scanner close just before closing out main
 */