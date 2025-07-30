//created on 30/07/2025

package exception.handling;

public class ExceptionHandlingRunner2 {

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
			String str = null;
			str.charAt(0);
			str.length();
			System.out.println("Method 2 ended");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
//output

/*
 * java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because
 * "str" is null at
 * Exception_Handling/exception.handling.ExceptionHandlingRunner2.method2(
 * ExceptionHandlingRunner2.java:20) at
 * Exception_Handling/exception.handling.ExceptionHandlingRunner2.method1(
 * ExceptionHandlingRunner2.java:13) at
 * Exception_Handling/exception.handling.ExceptionHandlingRunner2.main(
 * ExceptionHandlingRunner2.java:7) method 1 executed main Executed
 */