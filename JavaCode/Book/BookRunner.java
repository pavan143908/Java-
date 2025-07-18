// created on 18/07/2025
package oopsLevel2;

public class BookRunner {

	public static void main(String[] args) {

		Book book = new Book(123, "Object Oriented Programming with Java", "pavan");

		book.addreview(new Review(10, "Great book", 5));// assigning review and adding to addreview ArrayList
		System.out.println(book);

		book.addreview(new Review(101, "Awesome", 5));
		System.out.println(book);
	}

}
// id =123 name:Object Oriented Programming with Java Aurthor :pavan   review=[10 Great book 5 ]
// id =123 name:Object Oriented Programming with Java Aurthor :pavan   review=[10 Great book 5 , 101 Awesome 5 ]
