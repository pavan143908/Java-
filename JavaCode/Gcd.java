
/***The full form of LCM is Least Common Multiple. It’s the smallest positive number that is a multiple of two or more given numbers. 🔢
🧮 Example:
- LCM of 4 and 5 is 20, because:- Multiples of 4: 4, 8, 12, 16, 20, ...
- Multiples of 5: 5, 10, 15, 20, ...
- 20 is the first number that appears in both lists.


📘 Why It’s Useful:
- LCM is often used when adding or subtracting fractions with different denominators.
- It helps in solving problems involving repeating events or cycles.

Want to try calculating the LCM of a few numbers together? Or curious how it compares to GCD?

***/
package loops;

public class Gcd {

	public static void main(String[] args) {
		int number1 = 48;
		int number2 = 18;// gcd of 48,18 is 6
		int min = Math.min(number1, number2);

		for (int i = min; i > 0; i--) {
			if (number1 % i == 0 && number2 % i == 0) {
				System.out.println(i);
				break;
			}
		}

	}

}
