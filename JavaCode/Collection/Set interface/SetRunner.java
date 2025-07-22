//created on 22/07/20205

package collections2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
	public static void main(String[] args) {
		List<Character> character = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		System.out.println("List:" + character);
		// unique Set
		// Tree
		// HashSet
		// LinkedHashSet

		Set<Character> hashSet = new HashSet<>(character);
		System.out.println("hashSet:" + hashSet);
		// HashSet places data in random way

		Set<Character> linkedHashSet = new LinkedHashSet<>(character);
		System.out.println("linkedHashSet:" + linkedHashSet);
		// LinkedHashSet places data in liner comming way

		Set<Character> treeSet = new TreeSet<>(character);
		System.out.println("treeSet:" + treeSet);
		// TreeSet places data in sorted way

	}
}

//output

//List:[A, Z, A, B, Z, F]
//hashSet:[A, B, F, Z]
//linkedHashSet:[A, Z, B, F]
//treeSet:[A, B, F, Z]
