package com.OOPs.java;

class Rectangle {
	double length;
	double breadth;
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
		
	}
	public double getArea() {
		return this.length*this.breadth;
	}
	public double getPerimeter() {
		return 2*(this.length+this.breadth);
	}
}

