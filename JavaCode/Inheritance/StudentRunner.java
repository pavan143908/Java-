// created on 19/07/2025

package oopsLevel2Inheritance;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		/*
		 * Student student = new Student(); Person person = new Person();
		 *
		 * person.setName("pavan"); person.setEmail("reddyvaripavan90@gmail.com");
		 *
		 * // System.out.println(student.getName()); //
		 * System.out.println(student.getEmail());
		 *
		 * String value = person.toString(); System.out.println(value);
		 * System.out.println(person);
		 */
		Employee emp = new Employee("pavan", "programmer");
		// Student student = new Student("", "college");

		emp.setEmail("reddyvaripavan90@gmail.com");
		emp.setPhoneNumber("123456987");

		emp.setEmployeeGrade('A');
		emp.setEmployer("company HR");
		emp.setSalary(new BigDecimal(20000));

		System.out.print(emp);

	}

}
//Person constructor
//Employee constructor
//name:pavan email:reddyvaripavan90@gmail.com phoneNumber:123456987 title:programmer employer: company HR employeeGrade: A salary: 20000
