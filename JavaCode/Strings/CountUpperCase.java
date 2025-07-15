//to count the number of upper case letters in a strin

package strings;

public class CountUpperCase {

	public static void main(String[] args) {

		String str = "paVan "; // contains only one V

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);

	}

}
/***
 * the output as follows 1
 ***/