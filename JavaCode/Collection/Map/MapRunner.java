// created on 24/07/2025

package collectionsMap;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {

		String str1 = "this is Pavan , persuing my batchelours degree in engineering college";

		Map<Character, Integer> occurance = new HashMap<>();

		char[] characters = str1.toCharArray();

		System.out.println(characters);

		for (char character : characters) {

			Integer integer = occurance.get(character);
			if (integer == null) {
				occurance.put(character, 1);
			} else {
				occurance.put(character, integer + 1);
			}
		}
		System.out.println(occurance);
		System.out.println("*************************************");

		Map<String, Integer> stringOccurance = new HashMap<>();

		String[] words = str1.split(" ");

		for (String word : words) {

			Integer integer = stringOccurance.get(word);
			if (integer == null) {
				stringOccurance.put(word, 1);
			} else {
				stringOccurance.put(word, integer + 1);
			}
		}
		System.out.println(stringOccurance);
	}

}

//this is Pavan , persuing my batchelours degree in engineering college
//{ =10, a=3, b=1, c=2, d=1, e=10, g=5, h=2, i=6, ,=1, l=3, m=1, n=6, o=2, P=1, p=1, r=4, s=4, t=2, u=2, v=1, y=1}
//*************************************
//{college=1, in=1, batchelours=1, Pavan=1, this=1, degree=1, is=1, engineering=1, ,=1, my=1, persuing=1}
