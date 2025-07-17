package LongestSting;

public class ArryMagic {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 0, 55 };
		int number = 7;
		if (array.length == 0) {
			System.out.println("false1");

		}
		for (int value : array) {
			if (value > number) {
				System.out.println("true" + value);
			}
		}

	}

}/***true8
true9
true11
true22
true33
true44
true55
***/
