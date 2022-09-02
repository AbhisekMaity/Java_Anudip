/*
 * 1. Write a java program to input 5 elements of an array and search 
 * for a number whether it is present in an array or not. 
 * If present print its position in the array.

 */
package com.ds.java;
import java.util.Scanner;
public class SearchAnElement {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 int size=5,i;
//	 System.out.println("Enter how many element you want to insert ");
//	 size=sc.nextInt();
	 int arr[]=new int[size];
	 System.out.println("Enter five element one by one ");
	 for(i=0;i<size;i++) {
		 arr[i]=sc.nextInt();
	 }
	  System.out.println("Enter the element which you want to search ");
	 int data=sc.nextInt();
	  int flage=0;
	 for(i=0;i<size;i++) {
		 if(arr[i]==data) {
			 flage=1;
			 break;
		 }
		 
	 }
	 if(flage==1) {
		  System.out.println(" The element is found at index " +i);

	 }
	 else {
		  System.out.println(" The element is not found");

	 }
	 }
}
