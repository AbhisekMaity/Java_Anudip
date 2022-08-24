package com.java;
//import java.util.Scanner;

/*
 Write a program in Java to display the pattern like right angle triangle with a number

Test Data
Input number of rows : 10
Expected Output :

1                                                                                
12                                                                               
123                                                                              
1234                                                                             
12345
*/
public class NumberPttern112 {
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
		int r=10;
		r=r/2;
		for(int row=1;row<=r;row++) {
			int n =1;

			for(int col=1;col<=row;col++) {
				System.out.print(n+" ");
				n++;

			}

			System.out.println();
		}
	}

}