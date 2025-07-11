package loopsStatements;

import java.util.Scanner;

public class DoWhileLoopRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = 0;
		do {
			System.out.println("cube is:" + (number * number * number));
			System.out.println("enter a number:");
			number = sc.nextInt();

		} while (number > 0);
		System.out.println("thanks ");
		sc.close();
	}
}
