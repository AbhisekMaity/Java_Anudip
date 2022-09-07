package com.JUnit_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.java.Junit.StdBusinessLogic;
import com.java.Junit.StudentDetails;


class TestStdDetails {
	StudentDetails obj1=new StudentDetails();
	StdBusinessLogic obj2 = new StdBusinessLogic();
	@Test
	public void testStudent() {
		obj1.setName("Abhisek Maity");
		obj1.setMarks1(92);
		obj1.setMarks2(93);
		obj1.setMarks3(95);
		
		double percent=obj2.calculatePercentage(obj1);
		assertEquals(93.33333333333333,percent);

		
	}
	
	
	

}

