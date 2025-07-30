//created on 30/07/2025

package exception.handling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {

		method1();
		System.out.println("main Executed");

	}

	private static void method1() {
		method2();
		System.out.println("method 1 executed");
	}

	private static void method2() {
		String str = null;
		// str.charAt(0);
		str.length();
		System.out.println("Method 2 ended");
	}

}
// output
// it shows exception