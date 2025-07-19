// created on 19/07/2025

package oopsLevel2Inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
	private String title;
	private String employer;
	private char employeeGrade;

	public Employee(String name, String title) {
		super(name);
		this.title = title;
		System.out.println("Employee constructor");
	}

	public String getTitle() {
		return title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	private BigDecimal salary;

	@Override
	public String toString() {
		return super.toString() + " title:" + title + " employer: " + employer + " employeeGrade: " + employeeGrade
				+ " salary: " + salary;
	}

}
