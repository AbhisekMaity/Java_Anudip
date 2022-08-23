package com.ascci.java;
public class AscciTriangle2 {
	public static void main(String args[]) {
		char ch ='A';

		for(int row=1;row<=5;row++) {
			for(int col=row;col<=5;col++) {
				System.out.print(ch+" ");
			}
			ch++;

			System.out.println();
		}
	}

}