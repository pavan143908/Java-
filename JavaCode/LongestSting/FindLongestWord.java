//created on the date of 17/07/2025

package LongestSting;

public class FindLongestWord {

	public static void main(String[] args) {

		String sentence = "A qick branch fox jumps over the dog";

		if (sentence == null || sentence.equals("")) {
			System.out.println("-1");
		}

		String[] words = sentence.split(" ");

		int maxLength = 0;
		String longestWord = "";

		for (String word : words) {
			if (word.length() > maxLength) {
				maxLength = word.length();
				longestWord = word;
			}
		}
		System.out.println(longestWord);// branch will be the out for being longest word
	}

}
