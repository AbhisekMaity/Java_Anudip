/*
 * . Create a super class called Car. The Car class has the following fields and methods.
◦intspeed;
◦doubleregularPrice;
◦Stringcolor;
◦doublegetSalePrice();

Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.
◦intweight;
◦doublegetSalePrice();//Ifweight>2000,10%discount.Otherwise,20%discount.

Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods
◦intyear;
◦intmanufacturerDiscount;
◦doublegetSalePrice();//From the saleprice computed from Car class,subtract the manu facturer Discount.
 */

package com.OOPs.java;
//import java.util.Scanner;

 


public class CarMain {
 public static void main(String args[]) {
	 Truck tc=new Truck(1000,100,3000000,"Green");
	 Ford fd = new Ford(2022,1000,120,2000000,"Black");
	 

	 System.out.println("After discount the truck  Sales price  is "+tc.getSalePrice());
	 System.out.println("After discount the car Sales price is " +fd.getSalePrice());
    
}
}
