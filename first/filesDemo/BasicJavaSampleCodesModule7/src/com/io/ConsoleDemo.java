package com.io;

/*
 * Execute this code on Operating System console using Command prompt.
 * reason is Console class represents the Operating System console and not eclipse console
 * If this code is executed in eclipse, NullPointerException will be thrown
 */
import java.io.Console;


public class ConsoleDemo {
	public static void main(String[] args) {
		Console console = System.console();
		String name = console.readLine("Enter name: ");
		System.out.println(name);
		char ch[] = console.readPassword("Enter password: ");
		System.out.println(ch);
	}
}
