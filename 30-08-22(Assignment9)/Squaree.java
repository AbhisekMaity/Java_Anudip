package com.OOPs.java;

class Squaree extends Rectangle {
	 
   double side;
   Squaree(double side){
	   super(5,6);
	   this.side=side;
   }
   public double getAreaSq() {
	   return this.side * this.side;
   }
   public double getPeriSq() {
	   return 4*this.side;
   }
   
}
