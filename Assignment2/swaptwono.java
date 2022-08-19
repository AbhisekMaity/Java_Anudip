package com.java;

public class swaptwono {
	public static void main(String args[]) {
		int a =23;
		int b=78;
		System.out.println("Before swaping the value");
		System.out.println("a = "+a+" and b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping the value");
		System.out.println("a = "+a+" and b= "+b);
	}

}
