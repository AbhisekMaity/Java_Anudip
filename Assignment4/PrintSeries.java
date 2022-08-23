package com.loop.java;
import java.util.Scanner;
//Write a program to calculate the sum of following series where n is input by user. 
//1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
public class PrintSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		double result=0.0;
		double i;
		for(i=1;i<=n;i++) {
			result=result+(1/i);
		}
		System.out.println("The result is " +result);
		
	}

}
