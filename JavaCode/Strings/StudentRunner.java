package arrayConcepts;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		int[] list_of_marks = { 95, 96, 89, 59, 96, 99 };
		Student student = new Student("ramu", list_of_marks);

		int number = student.getNumberOfMarks();
		System.out.println("Number of marks:" + number);

		int sum = student.getTotalNumberOfMarks();
		System.out.println("Total Number Of Marks:" + sum);

		int maximumMarks = student.getMaximumMarks();
		System.out.println("Maximum of Marks:" + maximumMarks);

		int minimumMarks = student.getMinumMarks();
		System.out.println("Minimum of Marks:" + minimumMarks);

		BigDecimal average = student.getAverageMarks();
		System.out.println("Average of Marks:" + average);

	}

}
