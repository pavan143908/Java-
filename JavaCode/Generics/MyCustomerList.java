//created on 25/07/2025

package generics;

import java.util.ArrayList;

public class MyCustomerList<T> {

	ArrayList<T> list = new ArrayList<>();

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	@Override
	public String toString() {
		return list.toString();
	}

	public T get(int index) {
		return list.get(index);
	}

}
