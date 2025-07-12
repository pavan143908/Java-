package loops;

public class SumOfDigits {

	public static void main(String[] args) {
		int number = 1234;
		int sumOfDigits = 0;
		while (number > 0) {
			sumOfDigits += number % 10;
			number = number / 10;
		}
		System.out.println(sumOfDigits);
	}

}
