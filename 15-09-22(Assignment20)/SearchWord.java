
package com.strings;

import java.util.Scanner;

public class SearchWord {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the String");
	String s=sc.nextLine();
	System.out.println("Enter the word which we want to search ");
	String word=sc.next();

	String arr[]=s.split(" ");
	int flag=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i].equals(word)) {
			flag=1;
			break;
		}
	}
	if(flag==1) {
	System.out.println("Yes the word is found ");
  }
	else {
		System.out.println("Opps the word is not present in the string");

	}
  }
}

