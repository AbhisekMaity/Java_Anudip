
package com.loop.java;

public class LabelLoop {
	public static void main(String args[]) {
		first:
		for(int i=1;i<=10;i++) {
			second:
			for(int j=1;j<=10;j++) {
				if(i==2&&j==2) {
					break first;
				}
				System.out.println(i+" "+j);
			   }
			}
			System.out.println();
		}
	}



