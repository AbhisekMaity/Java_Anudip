package com.loop.java;

import java.util.Scanner;


public class Calculator {
	public static void main(String args[]) {
		double a;
		double b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a and b");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Enter the operators + for addition, - for Substraction, * for multiplication and / for division ");
		String opr=sc.next();

		
		switch(opr) {
		case "+":
			System.out.println("The addition of two number is " +(a+b));
			break;
		case "-":
			System.out.println("The Substration of two number is " +(a-b));
			break;
		case "*":
			System.out.println("The Multiplication of two number is " +(a*b));
			break;
		case "/":
			System.out.println("The Division of two number is " +(a/b));
			break;
		default:
			System.out.println("Invalid input");
		}
	}

}