package com.loop.java;
import java.util.Scanner;
public class PrimeNoRange {
	public static void main(String args[]) {

		System.out.println("The prime no between 15 to 30 are...");

		for(int a=15;a<=30;a++) {
		
	int temp=0;
	int i;
		for(i=2;i<a;i++) {
			if(a%i==0) {
				temp=1;
				break;
			}
		}
		if(temp==0) {
			System.out.println(i);
		}
	}
		}

	}
