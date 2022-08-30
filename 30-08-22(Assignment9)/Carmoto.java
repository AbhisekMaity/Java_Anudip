package com.OOPs.java;

 class Carmoto extends MotorVehicle  {
	 double discountRate;
	 String carName;
	 
	 Carmoto(double discountRate,String carName,String modelName,String modelNumber,double modelPrice){
		 super(modelName,modelNumber,modelPrice);
		 this.carName=carName;
		 this.discountRate=discountRate;
	 }
	 public void display() {
		 System.out.println("The Car Name is " +this.carName);

		 System.out.println("The model Name is " +this.modelName);
			System.out.println("The model Number is " +this.modelNumber);
			System.out.println("The model price is " +this.modelPrice);

	 
	 }
	 public void discount() {
		 double dis=this.modelPrice - this.modelPrice*(this.discountRate/100);
		 System.out.println("After discount the car price is " +dis);
	 }
	 

}
