/*
 * WAP to input a string and check whether it is palindrome or not
 */
package com.strings;

import java.util.Scanner;

public class StringPal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter the string ");

		String str = sc.next();
		int i;
		int flag=0;
		for (i=0;i<str.length();i++) {
			if(!(str.charAt(i)==str.charAt(str.length()-1-i))) {
				flag=1;
				break;
				
				
				
			}
		}
		if(flag==0) {
			System.out.println("The entered string is palindrom ");
		}else {
			System.out.println("The entered string is not palindrom ");

		}

	}
}
