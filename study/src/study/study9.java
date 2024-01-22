package study;

public class study9 {
	public static void main(String[] args) {
		Shape Rectangle = new Rectangle("blue", 2, 6);
		
		System.out.println("color :" + Rectangle.getColor());
		System.out.println("width :" + Rectangle.getarea());
	}
}

class Rectangle extends Shape {
	double length;
	double width;

	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangle Class constructor call");
		this.length = length;
		this.width = width;
	}

	double getarea() {
		return length * width;
	}
}

abstract class Shape {
	String color;

	abstract double getarea();

	public Shape(String color) {
		System.out.println("Shape Class constructor call");
		this.color = color;
	}

	public String getColor() {
		return color;
	}
}