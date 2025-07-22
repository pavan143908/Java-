package collections1;

public class Student implements Comparable<Student> {

	private int id;
	private String name;

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//to string format
	@Override
	public String toString() {
		return id + " " + name + " ";
	}

	@Override
	public int compareTo(Student that) {
		// return Integer.compare(this.id, that.id);// ascending order
		return Integer.compare(that.id, this.id); // descending order
	}

}
