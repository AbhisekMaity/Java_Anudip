//WAP to input an array having 3 rows and 3 columns of type String
package com.ds.java;
import java.util.Scanner;

public class Array2dInput {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 int sizerow,sizecol,i,j;
	 System.out.println("Enter how many row you want  ");
	 sizerow=sc.nextInt();
	 System.out.println("Enter how many column you want  ");
	 sizecol=sc.nextInt();
	 String arr[][]=new String[sizerow][sizecol];
	 System.out.println("Enter Array element one by one ");
	 for(i=0;i<sizerow;i++) {
		 for(j=0;j<sizecol;j++) {
			arr[i][j]=sc.next(); 
		 }
	 }
	 
	 System.out.println(" Printing the array  ");
	 for(i=0;i<sizerow;i++) {
		 for(j=0;j<sizecol;j++) {
			 System.out.print(arr[i][j]+ " ");

		 }
		 System.out.println();

	 }
 }
}
