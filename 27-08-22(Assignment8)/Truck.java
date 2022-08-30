package com.OOPs.java;

class Truck extends Car{
	
	int weight;
	
	Truck(int weight,int speed,double regularPrice,String color) {
		super(speed,regularPrice,color);
		this.weight=weight;
	}
	
	public double getSalePrice() {
		if(weight > 2000) {
			return this.regularPrice-this.regularPrice*0.1;
		}
		else {
			return this.regularPrice-this.regularPrice*0.2;
		}
	}
	

}