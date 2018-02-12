package com.psl.Vehicle;

public class Vehicle {
public Vehicle() {
	// TODO Auto-generated constructor stub
System.out.println("Vehicle");
}
}

class FourWheeler extends Vehicle{
	public FourWheeler()
	{
		System.out.println("FourWheeler");
	}
}

class TwoWheeler extends Vehicle{
	public TwoWheeler() {
		// TODO Auto-generated constructor stub
	
	System.out.println("Two Wheeler");}
}


class AudiQ7 extends FourWheeler{
	public AudiQ7() {
		// TODO Auto-generated constructor stub
	System.out.println("Audi Q7");
	}
}