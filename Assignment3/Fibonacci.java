package com.loop.java;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of  " );
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=1;
		int i=0;
do {
	i++;
	System.out.println (a);
	b=c;
	c=a;
	a=b+c;
}
while(i<=n);
	}

}
