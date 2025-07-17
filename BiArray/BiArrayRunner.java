//created on 17/07/2025
package BiArray;

public class BiArrayRunner {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 2, 3 };

		BiArray ab = new BiArray(array1, array2);

		boolean sum = ab.areSumEquals();
		System.out.println(sum);
	}

}

/***
 * int sum1 = calculateSum(array1); int sum2 = calculateSum(array2); if (sum1 ==
 * sum2) { System.out.println("true"); } else { System.out.println("false"); } }
 *
 * private static int calculateSum(int[] array1) { int sum = 0; for (int i :
 * array1) { sum += i;
 *
 * } return sum; }
 *
 * }
 ***/