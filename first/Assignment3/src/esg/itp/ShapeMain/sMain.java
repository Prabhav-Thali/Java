package esg.itp.ShapeMain;

import esg.itp.Shape.Rectangle;
import esg.itp.Shape.Square;

public class sMain {
	public static void main(String[] args) {
		Rectangle obj = new Rectangle(5, 8);
		obj.calcArea();
		obj.calcPeri();
		obj.display();

		Square objs = new Square(10);
		objs.calcArea();
		objs.calcPeri();
		objs.display();

	}
}
