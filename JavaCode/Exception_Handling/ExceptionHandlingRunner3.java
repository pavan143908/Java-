//created on 30/07/2025

package exception.handling;

public class ExceptionHandlingRunner3 {

	public static void main(String[] args) {

		method1();
		System.out.println("main Executed");

	}

	private static void method1() {
		method2();
		System.out.println("method 1 executed");
	}

	private static void method2() {
		try {

			int[] arr = { 1, 2, 3 };

			int number = arr[3];
			// code 1
			// String str = null;
			// str.charAt(0);
			// str.length();
			System.out.println("Method 2 ended");
		} catch (NullPointerException ex) {
			System.out.println("matched Pointer Exceptioin");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayOutOfBoundsExceptioin");
			ex.printStackTrace();

		}

		catch (Exception ex) {
			ex.printStackTrace();

		}
	}
}
//output for code 1

/*
 * Null Pointer Exceptioin java.lang.NullPointerException: Cannot invoke
 * "String.charAt(int)" because "str" is null at
 * Exception_Handling/exception.handling.ExceptionHandlingRunner2.method2(
 * ExceptionHandlingRunner2.java:20) at
 * Exception_Handling/exception.handling.ExceptionHandlingRunner2.method1(
 * ExceptionHandlingRunner2.java:13) at
 * Exception_Handling/exception.handling.ExceptionHandlingRunner2.main(
 * ExceptionHandlingRunner2.java:7) method 1 executed main Executed
 */

//output code 2
/*
 * ArrayOutOfBoundsExceptioin java.lang.ArrayIndexOutOfBoundsException: Index 3
 * out of bounds for length 3 at
 * Exception_Handling/exception.handling.ExceptionHandlingRunner3.method2(
 * ExceptionHandlingRunner3.java:22) at
 * Exception_Handling/exception.handling.ExceptionHandlingRunner3.method1(
 * ExceptionHandlingRunner3.java:13) at
 * Exception_Handling/exception.handling.ExceptionHandlingRunner3.main(
 * ExceptionHandlingRunner3.java:7) method 1 executed main Executed
 */
