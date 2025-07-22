//created on 22/07/2025



package collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {
	public static void main(String[] args) {

		List<Student> students = List.of(new Student(1, "pavan"), new Student(20, "ajay"), new Student(3, "venu"));

		ArrayList<Student> studentsAl = new ArrayList<>(students);

		System.out.println(studentsAl);

		Collections.sort(studentsAl);

		System.out.println("Desc:" + studentsAl);

		// Collections.sort(studentsAl, new AscendingComparatorStudent());

		studentsAl.sort(new AscendingComparatorStudent());
		System.out.println("AscendingComparatorStudent:" + studentsAl);

	}

}
//[1 pavan , 20 ajay , 3 venu ]
//Desc:[20 ajay , 3 venu , 1 pavan ]
//AscendingComparatorStudent:[1 pavan , 3 venu , 20 ajay ]
