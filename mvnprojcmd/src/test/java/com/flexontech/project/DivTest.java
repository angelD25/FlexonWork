package com.flexontech.project;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivTest {

	@Test
	public void test() {
		System.out.println("Div");
		Integer x = 3;
		Integer y = 2;
		Integer expResult = 1;
		Integer result = Calculator.div(x, y);
		assertEquals(expResult,result);
		assertEquals(null,Calculator.div(3, null));
		assertEquals(null,Calculator.div(null, 2));
		assertEquals(null,Calculator.div(null, null));
	}

}
