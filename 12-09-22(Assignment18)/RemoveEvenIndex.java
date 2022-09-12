/*
 * 4. write a java program to remove the characters at even 
 * indexes and then print the new string without
 *  using any method for removing
 */
package com.strings;
import java.util.Scanner;

public class RemoveEvenIndex {
  public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int i;
		for( i=0;i<s.length();i++) {
			if(i%2==0) {
				continue;
			}
			else {
				System.out.print(s.charAt(i));
			}
  }

}
}
