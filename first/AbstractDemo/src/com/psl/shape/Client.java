package com.psl.shape;

public class Client {
	public static void main(String[] args) {
		Shape s = new Circle(4);
		s.calcArea();
		s.display();
	}
}
