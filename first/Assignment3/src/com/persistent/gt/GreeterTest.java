package com.persistent.gt;

import com.persistent.app.Advisor;
import com.persistent.app.Greeter;

public class GreeterTest {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			Greeter g = new Greeter(args[i]);
			String hello = g.sayHello();
			System.out.println(hello);
		}
		Advisor a = new Advisor();
		String hello = a.getAdvice();
		System.out.println(hello);

		for (int i = 0; i < args.length; i++) {
			Greeter g = new Greeter(args[i]);
			String gb = g.goodBye();
			System.out.println(gb);
		}
	}
}
