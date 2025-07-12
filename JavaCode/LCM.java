package loops;

public class LCM {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 6;
		int max = Math.max(number1, number2);
		int lcm = max;
		while (true) {
			boolean finals = lcm % number1 == 0 && lcm % number2 == 0;
			if (finals) {
				System.out.println(lcm);
				break;
			}
			lcm = lcm + max;
		}

	}

}
