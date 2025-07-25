//created on 25/07/2025
package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	static <X> X returnValue(X value) {
		// generics for method returnValue

		return value;
	}

	static <X extends List> void duplicateList(X list) {// it extends method of type List only
		// generics for method duplicate
		list.addAll(list);

	}

	public static void main(String[] args) {

		// we can call method returnValue with any type
		String value1 = returnValue(new String());
		int number1 = returnValue(Integer.valueOf(5));
		ArrayList list1 = returnValue(new ArrayList());

		// just creating a ArrayList which duplicates by using dupicateList which
		// extends only List
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
		duplicateList(numbers);

		System.out.println(numbers);

		MyCustomerList<String> list = new MyCustomerList<>();

		list.addElement("Element 1");
		list.addElement("Element 2");
		String value = list.get(0);

		System.out.println(list);
		System.out.println(value);
		MyCustomerList<Integer> list2 = new MyCustomerList<>();

		list2.addElement(5);
		list2.addElement(20);

		Integer number = list2.get(0);
		// Alternatives
		// list2.addElement(Integer.valueOf(5));
		// list2.addElement(Integer.valueOf(20));
		System.out.println(list2);
		System.out.println("0 index " + number);

	}

}

//[1, 2, 3, 1, 2, 3]
//[Element 1, Element 2]
//Element 1
//[5, 20]
//0 index 5
