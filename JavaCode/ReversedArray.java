package abcd;

import java.util.Arrays;

public class ReversedArray {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		if (array.length < 0) {

			System.out.println("-1");
			return;
		}

		int[] reversedArray = new int[array.length];
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			reversedArray[start] = array[end];
			reversedArray[end] = array[start];
			start++;
			end--;
		}
		System.out.println(Arrays.toString(reversedArray));// [60, 50, 40, 30, 20, 10]

		return;
	}

}
