//created on 16/08/2025

package concurrency_concept;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {

		// add - copy
		// get

		// thread -3
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");

		// Thread -10000

		for (String element : list) {
			System.out.println(element);
		}
	}
}

//output

//Ant
//Bat
//Cat
