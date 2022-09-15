/*
 * Write a Java Program to Delete 
 * All Repeated
 *  Words in String.
 */
package com.strings;

import java.util.Scanner;

public class DeleteRecord {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the String");
	String s=sc.nextLine();
	String arr[]=s.split(" ");
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i].equals(arr[j])) {
				System.out.println("The repeated word is " +arr[j]);
			}
		}
	}
  }
}
