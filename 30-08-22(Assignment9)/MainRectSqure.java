package com.OOPs.java;

public class MainRectSqure {
  public static void main(String args[]) {
	  Rectangle obj=new Rectangle(14,15);
	  Squaree obj1 = new Squaree(12);
	  
	  System.out.println("The area of rectangle is " +obj.getArea());
	  System.out.println("The perimeter of rectangle is " +obj.getPerimeter());
	  System.out.println("The area of squre is " +obj1.getAreaSq());
	  System.out.println("The perimeter of squre is " +obj1.getPeriSq());

  }
}
