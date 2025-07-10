package loopsStatements;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
		// TODO Auto-generated constructor stub
	}

	public boolean isPrime() {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= number - 1; i++) {
			if (number % 2 == 0) {
				return false;
			}
		}
		return true;

	}
}
