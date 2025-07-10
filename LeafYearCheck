//file name as LeafYearCheckUp.java
package year;

public class LeafYearCheckUp {

	public static void main(String[] args) {
		int i = 2000;
		System.out.println(isLeafYear(i));
	}

	static boolean isLeafYear(int year) {
		if (year % 4 != 0) {
			return false;
		}
		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		}
		if (year % 4 == 0 && year % 100 == 0) {

			if (year % 400 == 0) {

				return true;
			} else {
				return false;
			}
		}

		return false;
	}
}
