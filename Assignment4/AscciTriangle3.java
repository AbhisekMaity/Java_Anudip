package com.ascci.java;
public class AscciTriangle3 {
	public static void main(String args[]) {

		for(int row=1;row<=5;row++) {
			char ch ='A';

			for(int col=1;col<=row;col++) {
				System.out.print(ch+" ");
				ch++;

			}

			System.out.println();
		}
	}

}