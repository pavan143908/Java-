// Created on 23/07/2025

package collectionsQueue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		// return Integer.compare(value1.length(), value2.length());// Ascending order
		return Integer.compare(value2.length(), value1.length());// Descending order
	}

}

public class QueueRunner {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
//AscendingOrder
//Cat
//Zebra
//Monkey
//null

//Descending order
//Monkey
//Zebra
//Cat
//null

//Default output without  class StringLengthComparator implements Comparator is
//Cat
//Monkey
//Zebra
//null
