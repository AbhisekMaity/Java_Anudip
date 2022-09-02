/*
 * 4. Write a program to define a
 *  class Item containing code and
 *   price. Accept this data for 
 *   five objects using array of
 *    objects. Display code, 
 *    price in tabular form and also, display 
 * total price of all items.
 */
package com.ds.java;
import java.util.Scanner;

public class Item {
	
	int code,price;
	
	Item(int c,int p)
	{
		code=c;
		price=p;
	}
	
	
	
	public static void main(String args[])
	{
		Item it[]=new Item[5];
		for(int i=0;i<5;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the code");
			int co=sc.nextInt();
			System.out.println("enter the price");
			int pr=sc.nextInt();
			it[i]=new Item(co,pr);
		}
		
		/*Display*/
		for(int i=0;i<5;i++)
		{
			System.out.println(it[i].code+" "+it[i].price);
		}
		/*Sum*/
int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+it[i].price;
		}
		System.out.println(sum);
		
		
	}
}