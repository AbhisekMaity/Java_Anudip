package com.loop.java;
/*
 Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like : 

1
2 3
4 5 6
7 8 9 10
 */


public class NumberPattern123 {
	public static void main(String args[]) {
		int x=1;
		int r=4;
		for(int row=1;row<=r;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}

}
