//to check weather two consicative character same
package strings;

public class DoesAStringHaveConsecativeChars {
	public static void main(String[] args) {
		String str = "ABCDEEFGHIJ";
		for (int i = 0; i < str.length() - 1; i++) {
			char currentCharacter = str.charAt(i);
			char nextCharacter = str.charAt(i + 1);
			if (currentCharacter == nextCharacter) {
				System.out.println("true");
			}
		}
		System.out.println("Default::false");
	}
}
//output will be true