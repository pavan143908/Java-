// Created on 25/07/2025

package collectionsUdemy;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {

		String str1 = "Listen";
		String str2 = "silent";

		if (str1 == null || str2 == null) {
			System.out.println("string is null");
			return;
		}

		if (str1.length() != str2.length()) {
			System.out.println("length is not same");
			// System.out.println("str1:" + str1 + "\tlength:" + str1.length());
			// System.out.println("str2:" + str2 + "\tlength:" + str2.length());
			return;
		}

		String lowercaseString1 = str1.toLowerCase();
		String lowercaseString2 = str2.toLowerCase();

		char[] charArray1 = lowercaseString1.toCharArray();
		char[] charArray2 = lowercaseString2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		if (Arrays.equals(charArray1, charArray2)) {

			System.out.println("Yes they are Anagram!");
			return;
		}
	}

}
//Yes they are Anagram!
