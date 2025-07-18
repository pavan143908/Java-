// created on 18/07/2025
package oopsLevel2;

import java.util.ArrayList;

public class Book {

	private int id;
	private String name;
	private String aurthor;
	private ArrayList<Review> reviews = new ArrayList<>();

	public Book(int id, String name, String aurthor) {

		this.id = id;
		this.name = name;
		this.aurthor = aurthor;
	}
	public void addreview(Review review) {
		this.reviews.add(review);
	}

	@Override
	public String toString() {
		return String.format(" id =%d name:%s Aurthor :%s   review=%s", id, name, aurthor, reviews);
	}

}