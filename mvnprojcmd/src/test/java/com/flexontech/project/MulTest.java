package com.flexontech.project;

//import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class MulTest extends TestCase {

	@Test
	public void test() {
		System.out.println("Mul");
		Integer x = 2;
		Integer y = 3;
		Integer expResult = 6;
		Integer result = Calculator.mul(x, y);
		assertEquals(expResult,result);
		assertEquals(null,Calculator.mul(2, null));
		assertEquals(null,Calculator.mul(null, 3));
		assertEquals(null,Calculator.mul(null, null));
	}

}
