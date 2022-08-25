/*
 Write a program that would print the information
(name, year of joining, salary, address) 
of three employees by creating a class named 
'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam               2000               68D- WallsStreat
John              1999               26B- WallsStreat
 */

package com.OOPs.java;

 public class EmpDetails {
	public static void main(String args[]) {
		Employee obj = new Employee();
		
		obj.display("Robert", 1994, "64C-WallsStreat", 50000);
		
		obj.display("Sam   ",    2000,"64C-WallsStreat", 60000);

		obj.display("Robert", 1999, "64C-WallsStreat", 80000);

		
	}

}
