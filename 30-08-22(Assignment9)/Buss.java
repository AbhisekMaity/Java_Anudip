package com.OOPs.java;

class Buss extends Vehicle {
 private String routeNumber;
  Buss(String routeNumber,int regnNumber,double speed,String color,String ownerName){
	  super(regnNumber,speed,color,ownerName);
	  this.routeNumber=routeNumber;
  }
  public void showData() {
	  super.showData();
	  System.out.println("The route Number is " +this.routeNumber);
	  
	  System.out.println("The Reg Number is " + this.regnNumber);

	  System.out.println("The speed of the bus is " +this.speed);

	  System.out.println("The bus color  is " +this.color);

	  System.out.println("The the owner name is " +this.ownerName);

	  
  }
}
