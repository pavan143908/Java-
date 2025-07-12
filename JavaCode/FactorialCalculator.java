package loops;

public class FactorialCalculator {

	public static void main(String[] args) {

		int number = 5;
		if (number < 0) {
			return;
		}
		int factorial = 1;
		for (int i = 2; i <= number; i++) {
			factorial = factorial * i;
		}

		System.out.println(factorial);
	}

}
