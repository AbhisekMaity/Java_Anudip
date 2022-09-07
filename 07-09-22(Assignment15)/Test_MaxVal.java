package com.JUnit_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_MaxVal {

	@Test
	public void testMax() {
		MaxValueAnArray val=new MaxValueAnArray();
		int arr[]= {23,67,89,12,60};
		int size=arr.length;
		int actual=val.findMax(arr, size);
		int expected=89;
		assertEquals(actual,expected);
	}

}
