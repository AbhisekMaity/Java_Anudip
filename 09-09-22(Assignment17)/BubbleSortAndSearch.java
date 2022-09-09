package com.ds.java;

import java.util.Scanner;


public class BubbleSortAndSearch {
   public static void bubbleSort(int arr[]) {
	   int i,j,temp;
	   for(i=0;i<arr.length;i++) {
		   for(j=i+1;j<arr.length;j++) {
			   if(arr[i]>arr[j]) {
				   temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
	   }
   }
   public static int linearSearch(int arr[],int terget) {
	   int i,flag=0;
	   for(i=0;i<arr.length;i++) {
		   if(terget==arr[i]) {
			   flag=1;
			   break;
		   }
	   }
	   return flag;
   }
   public static void main(String args[]) {
	   Scanner sc = new Scanner (System.in);
	   System.out.println("Enter how many element we want to insert ");
	   int size=sc.nextInt();
	   int arr[]=new int[size];
	   System.out.println("Enter the array element randomly");
	   for(int i=0;i<size;i++) {
		   arr[i]=sc.nextInt();

	   }
	   System.out.println(" After sorting the array elements are ");

	   bubbleSort(arr);
	   for(int i=0;i<size;i++){
		   System.out.println(arr[i]);
	   }
	   
	   System.out.println("Enter the elemet which you want to search ");
	   int terget=sc.nextInt();
	   int result=linearSearch(arr,terget);
	   if(result==1) {
		   System.out.println(" The elemetn is found ");
	   }
	   else {
		   System.out.println(" The elemetn is not found ");

	   }
   }
}
