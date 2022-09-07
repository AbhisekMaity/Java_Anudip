package com.JUnit_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpTest {
	EmployeeDetails e=new EmployeeDetails();
	EmpBussinessLogic b=new EmpBussinessLogic();
	
	@Test
	void testApprisal() {
		e.setName("Ronit");
		e.setAge(23);
		e.setMonthlySalary(400);
		double appraisal=b.calculateAppraisal(e);
		assertEquals(500,appraisal);
	}

}
