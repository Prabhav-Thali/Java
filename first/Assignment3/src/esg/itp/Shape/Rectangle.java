package esg.itp.Shape;

public class Rectangle implements Polygon {
	float l, b, a, p;

	public Rectangle(float len, float bre) {
		// TODO Auto-generated constructor stub
		l = len;
		b = bre;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		a = l * b;

	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		p = 2 * (l + b);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out
				.println("Area and Perimeter of Rectangle are " + a + " " + p);
	}
}
