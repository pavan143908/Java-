//created on 30/07/2025

package exception.handling;

import java.util.Scanner;

public class TryWithResourcesRunner {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

			int number = numbers[10];

		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();

		} catch (Exception ex) {
			ex.printStackTrace();

		}
	}
}
//output
//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 9
//at Exception_Handling/exception.handling.TryWithResourcesRunner.main(TryWithResourcesRunner.java:12)
