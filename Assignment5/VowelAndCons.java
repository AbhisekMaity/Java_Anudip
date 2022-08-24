package com.ascci.java;
import java .util.Scanner;
public class VowelAndCons {
	public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    char ch;
    System.out.println("Enter An Alphabet : ");
    ch=sc.next().charAt(0);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
    	
    	System.out.println(ch+ " This is vowel");
    }
    else if((ch>='a'&&ch<='z') ||(ch>='A'&&ch<='Z')){
    	
    	System.out.println(ch+ " This is Consonent");

    	}
    else {
    	System.out.println("Opps!! you entered worng input........");
    }
    
	}
	
}
