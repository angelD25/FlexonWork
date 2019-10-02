package com.flexontech.project;

//import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class SubTest extends TestCase {

	@Test
	public void test() {
		System.out.println("Sub");
		Integer x = 20;
		Integer y = 15;
		Integer expResult = 5;
		Integer result = Calculator.sub(x, y);
		assertEquals(expResult,result);
		assertEquals(null,Calculator.sub(20, null));
		assertEquals(null,Calculator.sub(null, 15));
		assertEquals(null,Calculator.sub(null, null));
	}

}
