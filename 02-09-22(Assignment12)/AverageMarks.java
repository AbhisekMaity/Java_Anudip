/*
 * 2. Write a program to print the roll number and average marks of 8 students 
 * in three subjects (each out of 100). The marks are entered by user.
 */
package com.java;
import java.util.Scanner;
public class AverageMarks {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	int i,avg;
	for(i=1;i<=8;i++) {
		System.out.println("Enter the roll no of " +i+ " Student");
		int roll=sc.nextInt();
		
		
		System.out.println("Enter the  marks of first subject ");
		int sub1=sc.nextInt();
		
		System.out.println("Enter the  marks of second subject ");
		int sub2=sc.nextInt();
		
		System.out.println("Enter the  marks of third subject ");
		int sub3=sc.nextInt();
		
		avg=(sub1+sub2+sub3)/3;
		
		if(sub1<=100 && sub2<=100 && sub3 <=100) {
		
		System.out.println(" The average marks of roll_no " +roll+ " is " +avg);
		}
		else {
			System.out.println("Please enter the subject marks between 1 to 100 ");

		}
		
	}
}
}
