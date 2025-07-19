// created on 19/07/2025

package oopsLevel2Inheritance;

public class Person {
	// public class Person extends Object---default inheritance of Object
	private String name;
	private String email;
	private String phoneNumber;

//constructor
	public Person(String name) {
		this.name = name;
		System.out.println("Person constructor");
		// super class constructor
	}

//
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "name:" + name + " email:" + email + " phoneNumber:" + phoneNumber;
	}

}
