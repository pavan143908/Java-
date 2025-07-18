// created on 18/07/2025
package oopsLevel2;

public class RectangleRunner {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(200, 20);

		int a = rectangle.CalculateArea();
		int p = rectangle.CalculatePerimeter();
		System.out.println(rectangle);
		System.out.println("Area of rectangle:" + a);
		System.out.println("Perimeter of rectangle:" + p);

	}

}
