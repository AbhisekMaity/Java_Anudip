package com.java;

public class LeapYear {
 public static void main(String args[]) {
//	 int year =2016;
//	 if(year % 400==0||year % 100==0 ||year % 4==0 ) {
//		 System.out.println("The year is leap year");
//	 }
//	 else {
//		 System.out.println("The year is not leap year");
//
//	 }
	 
		int y=2016;
		if((y%400==0)&&(y%100==0) || (y%4==0))
		{System.out.println(y+" is leap year");
		}
		else {System.out.println(y+" is not leap year");
		}
  }
}
