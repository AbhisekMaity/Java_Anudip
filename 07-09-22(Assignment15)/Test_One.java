package com.JUnit_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_One {

	@Test
	void add() {
		Add obj=new Add();
		int actual=obj.sums(5, 9);
		int expected=14;
		assertEquals(actual,expected);
	}

}
