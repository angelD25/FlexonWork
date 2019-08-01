package com.flexontech.project;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemTest {

	@Test
	public void test() {
		System.out.println("Rem");
		Integer x = 3;
		Integer y = 2;
		Integer expResult = 1;
		Integer result = Calculator.rem(x, y);
		assertEquals(expResult,result);
		assertEquals(null,Calculator.rem(3, null));
		assertEquals(null,Calculator.rem(null, 2));
		assertEquals(null,Calculator.rem(null, null));
	}

}
