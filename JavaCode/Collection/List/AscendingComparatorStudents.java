//created on 22/07/2025

package collections1;

import java.util.Comparator;

class AscendingComparatorStudent implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		return Integer.compare(student1.getId(), student2.getId());
	}

}
