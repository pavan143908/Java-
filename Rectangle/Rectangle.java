// created on 18/07/2025

package oopsLevel2;

public class Rectangle {
//state
	private int length;
	private int width;

//creation
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;

	}

//returning as string
	@Override
	public String toString() {

		return String.format("length:%d ,width:%d", length, width);
	}

//operation
	public int CalculateArea() {
		return (length * width);
		// A=l×w:
	}

	public int CalculatePerimeter() {
		return 2 * (length + width);
		// P=2(l+w):
	}

}
//length:200 ,width:20
//Area of rectangle:4000
//Perimeter of rectangle:440
