/*
 * 3. Write a program to throw a user-defined exception
 *  "String Mismatch Exception",
 *  if two strings are not equal (ignore the case).
 */
package com.strings;

import java.util.Scanner;

public class MainStingMisMatch {
	public static void misMatch(String str) throws StringMismatchException {
		String s="Abhisek";
		if(!(s.equalsIgnoreCase(str))){
			throw new StringMismatchException("Opps!!! Your entered String is not matched ");
		}
		else {
			System.out.println("Yes your Entered string is matched");
		}
	}
	 public static void main(String args[]) {
		 MainStingMisMatch obj=new MainStingMisMatch();
		  Scanner sc = new Scanner (System.in);
		  System.out.println("Enter the String");
		  String ss=sc.next();
		  try {
			  MainStingMisMatch.misMatch(ss);
		  }
		  catch(StringMismatchException e){
				System.out.println( e.getMessage());
			  
		  }

}
}
