package com.ds.java;
import java .util.Scanner;

public class AppleSales {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	double average;
	float sum=0;
	int i;
	float arr[]=new float[7];
	System.out.println("Enter the apple price one by one");
	for(i=0;i< 7;i++) {
		arr[i]=sc.nextFloat();
		sum=sum+arr[i];
		
	}
	
	System.out.println("The sum is : " +sum);
	average=sum/7;
	
	System.out.println("The average sales of week " +average);
	


 }
}
