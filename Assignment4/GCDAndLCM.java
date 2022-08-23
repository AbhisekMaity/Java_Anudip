package com.loop.java;

//Write a program to find greatest common divisor (GCD) or highest common factor 
//(HCF) of given two numbers
public class GCDAndLCM {
	public static void main(String args[]) {
		int a=34;
		int b=51;
		int GCD=1;
		int LCM;
		int res=a > b ? b : a;
		for(int i=1;i<=res;i++) {
			if(a%i==0 && b%i==0) {
				GCD=GCD*i;
				
			}
		}
		System.out.println("The GCD of " +a+" and " +b+" is " + GCD);
		LCM=(a*b)/GCD;
		System.out.println("The LCM of " +a+" and " +b+" is " + LCM);

	}

}
