
package com.loop.java;
import java.util.Scanner;
public class AmstrongNumber{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		int rem,sum=0;
		int temp=num;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(sum==temp) {
		System.out.println("The number is Amstrong ");
	}
		else {
			System.out.println("The number is not Amstrong ");

		}
	}

}
