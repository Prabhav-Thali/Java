package esg.itp.Shape;

public class Square implements Polygon {
	float side, area, peri;

	public Square(float x) {
		// TODO Auto-generated constructor stub
		side = x;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		area = side * side;
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		peri = 2 * side;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area and Perimeter of square are " + area + " "
				+ peri);
	}

}
