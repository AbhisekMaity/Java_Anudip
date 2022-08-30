package com.OOPs.java;

 class Carss extends Vehicle {
  private String manufacturerName;
  Carss(String manufacturerName,int regnNumber,double speed,String color,String ownerName){
	  super(regnNumber,speed,color,ownerName);
	  this.manufacturerName=manufacturerName;
  }
  public void showData() {
//	  super.showData();
	  System.out.println("The Manufacture name is " +this.manufacturerName);
	  
	  System.out.println("The Reg Number is " + this.regnNumber);

	  System.out.println("The speed of the car is " +this.speed);

	  System.out.println("The color is " +this.color);

	  System.out.println("The owner name is " +this.ownerName);

	  
  }
  
}
