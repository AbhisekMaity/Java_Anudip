package com.loop.java;
import java.util.Scanner;

/*
 Write a Java program to multiply two given 
 integers without using 
 the multiply operator(*).
 */
public class WithOutMul {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int a,b,i;
		System.out.println("Enter the value of two numbers ");
		a=sc.nextInt();
		b=sc.nextInt();
		int mul=0;
		for(i=1;i<=a;i++) {
			mul=mul+b;
		}
			
		System.out.println("The multiplication of two num is "+mul);
		}

	}
