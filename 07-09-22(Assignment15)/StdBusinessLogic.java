package com.JUnit_Testing;


public class StdBusinessLogic {
	public double calculatePercentage(StudentDetails std) {
		double percent=0;
		double total=(std.getMarks1()+std.getMarks2()+std.getMarks3());
		percent=(total/300)*100;
		return percent;
	}
}
