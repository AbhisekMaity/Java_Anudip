//WAP to input an array having 5 strings and display them

package com.ds.java;
import java.util.Scanner;
public class Array1dInput {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 int size,i;
	 System.out.println("Enter how many element you want to insert ");
	 size=sc.nextInt();
	 String arr[]=new String[size];
	 System.out.println("Enter Array element one by one ");
	 for(i=0;i<size;i++) {
		 arr[i]=sc.next();
	 }
	 
	 System.out.println("Printing Array element one by one ");
	 for(i=0;i<size;i++) {
		 System.out.println(arr[i]);

	 }

	 
 }
}
