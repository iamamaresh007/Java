package FromFirst.OOPS.six;

class Shape {
	protected double l;

	Shape(double l) {
		this.l = l;
	}
}

class Square extends Shape {
	Square(double l) {
		super(l);
	}

	void area() {
		System.out.println("Area of Square:" + (l * l));
	}

}

class Rectangle extends Square {
	private double b;

	Rectangle(double x, double y) {
		super(x);
		this.b = y;
	}

	void area() {
		System.out.println("Area of Rectangle:" + (l * b));
	}

}

public class Inherit {
	public static void main(String[] args) {
		Square sq = new Square(5.5);
		sq.area();
		
		Rectangle rec = new Rectangle(5.5,6);
		rec.area();
	}

}
