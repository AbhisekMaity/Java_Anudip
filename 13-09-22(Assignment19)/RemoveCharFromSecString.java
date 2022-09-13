
/*
 * 2.Write a Java Program to Remove all 
 * Characters in Second String
 *  which are Present in First String.
 * 
 */
package com.strings;

import java.util.Scanner;

public class RemoveCharFromSecString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1=sc.nextLine();
		
		System.out.println("Enter the second String");
		String s2=sc.nextLine();
		
		int i,j;
		System.out.println("These  are the following characters present in the \nsecond string which are also present in first string :-->");
		for(i=0;i<s1.length();i++) {
			int flag=0;
			for(j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					flag=1;
					break;
					
				}
				
			}
			if(flag==1) {
				System.out.print(s1.charAt(i)+ " ");
			}
			
		}
		
		
		
	}

}
