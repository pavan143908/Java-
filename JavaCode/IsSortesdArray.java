//created on 17/07/2025

package abcd;

public class IsSortesdArray {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50, 60, 70, 100, 90 };
		if (array.length <= 1) {
			System.out.println("true");
			return;
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] < array[i]) {
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
		return;
	}

}
