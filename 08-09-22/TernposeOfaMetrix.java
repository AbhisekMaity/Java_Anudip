package com.ds.java;

import java.util.Scanner;

public class TernposeOfaMetrix {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 int sizerow,sizecol,i,j;
	 System.out.println("Enter how many row you want  ");
	 sizerow=sc.nextInt();
	 System.out.println("Enter how many column you want  ");
	 sizecol=sc.nextInt();
	 int arr[][]=new int[sizerow][sizecol];
//	 int trns[][]=new int[sizerow][sizecol];
	 int trns[][]=new int[sizecol][sizerow];


	 System.out.println("Enter Array element one by one ");
	 for(i=0;i<sizerow;i++) {
		 for(j=0;j<sizecol;j++) {
			arr[i][j]=sc.nextInt(); 
		 }
	 }
	 
	 System.out.println(" Printing the matrix before transpose");
	 for(i=0;i<sizerow;i++) {
		 for(j=0;j<sizecol;j++) {
			 System.out.print(arr[i][j]+ " ");

		 }
		 System.out.println();

	 }
	 
	 for(i=0;i<sizerow;i++) {
		 for(j=0;j<sizecol;j++) {
//			 trns[i][j]=arr[j][i];
			 trns[j][i]=arr[i][j];
		 }

	 }
	 
//	 System.out.println(" Printing the matrix after transpose");
//	 for(i=0;i<sizerow;i++) {
//		 for(j=0;j<sizecol;j++) {
//			 System.out.print(trns[i][j]+ " ");
//
//		 }
//		 System.out.println();
//
//	 }
	 
	 System.out.println(" Printing the matrix after transpose");
	 for(int [] r:trns) {
		 for(int c:r ) {
			 System.out.print(c+ " ");

		 }
		 System.out.println();
	 }
 }
}
