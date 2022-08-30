package com.OOPs.java;

class Squaree extends Rectangle {
	 
   double side;
   Squaree(double side,double length,double breadth){
	   super(length,breadth);
	   this.side=side;
   }
   public double getAreaSq() {
	   return this.side * this.side;
   }
   
}
