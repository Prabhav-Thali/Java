package com.psl.testDemo;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.psl.demo.Calculator;

public class TestCalculator {
	static Calculator cal;

	@BeforeClass
	public static void setup() {
		// TODO Auto-generated method stub
		cal = new Calculator();

	}

	//
	// @Test
	// public void test() {
	// Assert.fail("Not yet implemented");
	// }

	@Test
	public void testAdd() {

		int actual = cal.add(10, 20);
		Assert.assertEquals(30, actual);
	}

	@Test
	public void divide() {
		// TODO Auto-generated method stub
		int actual = cal.divide(20, 0);
		Assert.assertEquals(20, actual);
	}
	
	@AfterClass
	public static void tearDown() {
		// TODO Auto-generated method stub

	}

}
