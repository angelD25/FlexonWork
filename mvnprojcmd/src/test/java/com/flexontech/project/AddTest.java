package com.flexontech.project;

import org.junit.Test;

import junit.framework.TestCase;

public class AddTest extends TestCase {
	@Test
	public void testSum() {
		System.out.println("Sum");
		Integer x = 15;
		Integer y = 15;
		Integer expResult = 30;
		Integer result = Calculator.sum(x, y);
		assertEquals(expResult,result);
		assertEquals(null,Calculator.sum(15, null));
		assertEquals(null,Calculator.sum(null, 15));
		assertEquals(null,Calculator.sum(null, null));
	}
}
