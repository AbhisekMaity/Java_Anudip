package com.java.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_MaxArray {

	@Test
	void test_max() {
		MaxValAnArray b=new MaxValAnArray();
		int arr[]= {12,34,67,89,23};
		int size=arr.length;
		int actual=b.findMax(arr, size);
		int expected=89;
	}

}
