package com.psl.console;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		Console con = System.console();

		String name = con.readLine("enter name:");// will only read data from
													// console if no parameters
													// are passed
		char[] ch=con.readPassword("Enter Password");
		
		System.out.println("name :"+name);
		System.out.println("password:"+ch);
	}
}
