package com.loop.java;
import java .util.Scanner;
public class InputUsingDowhile {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		boolean choice ;
		do {
			System.out.println("Enter the number1 ");
			num1=sc.nextInt();
			
			System.out.println("Enter the number2 ");
			num2=sc.nextInt();
			
			int sum=num1+num2;
			System.out.println("The addition of two number is " +sum);
			
			System.out.println("Enter your choice true or false ");
			choice=sc.nextBoolean();
			
			
			}while(choice==true);
		
	}

}
