package com.psl.shape;

public class Circle extends Shape {
	int r;

	public Circle(int r) {
		this.r = r;
		// TODO Auto-generated constructor stub
	}

	@Override
	void calcArea() {
		// TODO Auto-generated method stub
		float area = 3.14f * r * r;
		System.out.println("area of circle is : " + area);
	}

}
