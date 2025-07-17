//created on 17/07/2025

package BiArray;

public class BiArray {

	private int[] array1;
	private int[] array2;

	public BiArray(int[] array12, int[] array22) {
		this.array1 = array12;
		this.array2 = array22;

	}

	public boolean areSumEquals() {
		boolean sumation = (calculateSum(array1) == calculateSum(array2));
		return sumation;
	}

	private Object calculateSum(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}

}
