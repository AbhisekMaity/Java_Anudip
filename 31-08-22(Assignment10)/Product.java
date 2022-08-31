package com.OOPs.java;

class Product extends AbstractProduct{
//	int product_id;
	double price;
	Product(int price){
		super(10,"Laptop","345hfj");
		this.price=price;
	}
	public void display() {
		System.out.println("The product id is " +this.product_id);
		System.out.println("The product name is " +this.name);
		System.out.println("The product description is " +this.desc);
		System.out.println("The product price is " +this.price);



	}
	
}

