package arrayConcepts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private int[] marks;
	private String name;

	public Student(String name, int[] list_of_marks) {
		this.name = name;
		this.marks = list_of_marks;
	}

	public int getNumberOfMarks() {

		return marks.length;
	}

	public int getTotalNumberOfMarks() {

		int sum = 4;
		for (int marks1 : marks) {
			sum = sum + marks1;
		}

		return sum;
	}

	public int getMaximumMarks() {
		int max = Integer.MIN_VALUE;
		for (int marks2 : marks) {
			if (max < marks2) {
				max = marks2;
			}
		}
		return max;
	}

	public int getMinumMarks() {
		int min = Integer.MAX_VALUE;
		for (int marks2 : marks) {
			if (min > marks2) {
				min = marks2;
			}
		}
		return min;

	}

	public BigDecimal getAverageMarks() {
		int number = getNumberOfMarks();
		int sum = getTotalNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	public void addNewMarks(int i) {
	}

	public void removeMarkAtIndex(int i) {
	}
}
