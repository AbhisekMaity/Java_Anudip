package com.java.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Example {

	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	void test_add()
	{
		Addition a=new Addition();
		int actual=a.sum(5, 10);
		int expected=15;
		assertEquals(expected,actual);
	}
	

}
