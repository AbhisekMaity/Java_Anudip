package com.strings;
import java.util.Scanner;
public class FindChar {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sting");
		String s=sc.nextLine();
		System.out.println("Enter the character which we want to find ");
		char ch=sc.next().charAt(0);
		int flag=0;
		int i;
		for( i =0;i<s.length();i++)
		if(s.charAt(i) == ch) {
			flag=1;
			break;
			
		}
		if(flag==1) {
			System.out.println("The character at found at index " +i);
		}
		else {
			System.out.println("The character is not found ");
		}
		
	}

}