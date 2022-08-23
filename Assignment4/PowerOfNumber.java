package com.loop.java;
import java.util.Scanner;
//Two numbers are entered through the keyboard.
//Write a program to find the value of one number raised to the power of another.
//(Do not use Java built-in method)
public class PowerOfNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base  ");
		System.out.println("Enter the power  ");

		int base=sc.nextInt();
		int power=sc.nextInt();
	
		 
		
        int result=1;
		for(int i=1;i<=power;i++) {
		result=result*base;
			
		}
		System.out.println("The " +base+ " power " +power+ " is " +result);

		
		
	}

}