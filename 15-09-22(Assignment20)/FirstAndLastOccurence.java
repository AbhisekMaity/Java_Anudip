/*
 * Write a program to find the first and the last occurence
 *  of the letter 'o'  
 * in "Hello World".
 */
package com.strings;

public class FirstAndLastOccurence {
   public static void main(String args[]) {
	   String str="Hello, World";
	   char ch='o';
	    int first_ocr=0;
	    int sec_ocr=0;
		int i;
		for( i =0;i<str.length();i++) {
		if(str.charAt(i) == ch) {
		if(first_ocr==0) {
			first_ocr=i;
		}
		sec_ocr=i;
			}
		}
		if(first_ocr==0) {
			System.out.println("The letter is not found");
		}
		else {
			System.out.println("The first occurence of letter o is " +(first_ocr+1));

			System.out.println("The second occurence of letter o is " +(sec_ocr+1));

		}
   }
}
