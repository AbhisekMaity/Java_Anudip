package com.OOPs.java;



class TravelGuide extends Book{
	String country;
	TravelGuide(String country){
		super(121,"Devid","Java");
		this.country=country;
	}
	public void show3() {
		System.out.println("The country name is " +this.country);
		

   }
}