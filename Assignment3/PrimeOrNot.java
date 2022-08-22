
package com.loop.java;
import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		

		int n=sc.nextInt();
		if(n==1) {
			System.out.println(" 1 is not a prime no");
		}
		else {
		int temp=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				temp=1;
				break;
			}
		}
		
		if(temp==0) {
		System.out.println(" The number is prime ");

		}
		else {
			System.out.println(" The number is not prime ");

		}
		}
	}

}