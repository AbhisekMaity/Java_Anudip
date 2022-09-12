/*
 * Write a program to delete all consonents 
 * from the string
 *  "Hello, have a good day".
 */
package com.strings;

public class DeleteConstants {
	public static void main(String args[]) {
		String str="Hello,have a good day";
		
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i) =='a'|| str.charAt(i) =='A'
					||str.charAt(i) =='e'||str.charAt(i) =='E'
					||str.charAt(i) =='i'||str.charAt(i) =='I'
					||str.charAt(i) =='o'||str.charAt(i) =='O'
				||str.charAt(i) =='u'||str.charAt(i) =='U'||str.charAt(i)==' '||str.charAt(i)==','))

			{
				continue;

			}
			else {
				System.out.print(str.charAt(i));

			}
		}
	}
}
