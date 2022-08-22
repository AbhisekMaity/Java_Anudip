

package com.loop.java;
import java.util.Scanner;
public class SumAndAvg {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers ");

		int n=sc.nextInt();
		int o=sc.nextInt();
		int p=sc.nextInt();

		int q=sc.nextInt();

		int r=sc.nextInt();
		int sum = n+o+p+q+r;
		int avg=sum/5;
		
		System.out.println(" The sum of these numbers is  " +sum);
		System.out.println(" The average of these numbers is  " +avg);


		
	}

}
