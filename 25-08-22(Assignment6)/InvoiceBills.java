package com.OOPs.java;
import java.util.Scanner;
/*
 * Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
An Invoice should include four pieces of information as instance variables‐a part number(type String),a part
description(type String),a quantity of the item being purchased (type int) and a price per item  (double). Your
class should have a constructor that initializes the four instance variables. In addition, provide a method named
 getInvoice Amount that calculates the invoice amount (i.e., multiplies the quantity by the price per item),
  then returns the amount as a double value. If the
quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a
test application named InvoiceTest that demonstrates class Invoice’s capabilities.
 */


public class InvoiceBills {
    public static void main(String args[]) {
    	Invoice obj1=new Invoice("boAt242","HeadPhone",200,600.00);
    	Invoice obj2=new Invoice("Realme456","HeadPhone",400,700.00);
    	System.out.println(obj1.getpartNo()+ "  " +obj1.getDescription()+ "  " +obj1.getquantity()+ "  " +obj1.getprice()+ "  " +obj1.getInvoiceAmount());
    	System.out.println(obj2.getpartNo()+ "  " +obj2.getDescription()+ "  " +obj2.getquantity()+ "  " +obj2.getprice()+ "  " +obj2.getInvoiceAmount());
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the partno(string) ");
    	String pn=sc.nextLine();
    	System.out.println("Enter the description(string) ");

    	String ds=sc.nextLine();
    	
    	System.out.println("Enter the quantity ");

    	int qt=sc.nextInt();
    	
    	System.out.println("Enter the price ");

    	double pr=sc.nextDouble();
    	
    	obj1.setPartNo(pn);
    	obj1.setDescription(ds);
    	obj1.setquantity(qt);
    	obj1.setprice(pr);
    	System.out.println(obj1.getpartNo()+ "  " +obj1.getDescription()+ "  " +obj1.getquantity()+ "  " +obj1.getprice()+ "  " +obj1.getInvoiceAmount());

    	

    	
    }
    	
    }

