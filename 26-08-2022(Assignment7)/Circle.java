package com.OOPs.java;

class Circle{
	double radius=1.0;
	String color="red";
	Circle(){
		
	}
	Circle(double radius, String color){
		this.radius=radius;
		this.color=color;
	}
	public double getRadius() {
		return this.radius;
	}
	public double getArea() {
		return (double)3.14*this.radius*this.radius;
	}
	public String getColor() {
		return (String)this.color;
	}
}