package com.persistent.app;

public class Greeter {
	String name;

	public Greeter(String n) {
		// TODO Auto-generated constructor stub
		name = n;
	}

	public String sayHello() {
		return "hello" + name;

	}

	public String goodBye() {
		// TODO Auto-generated method stub
		return "GoodBye" + name;
	}
}
