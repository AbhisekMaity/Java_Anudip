package com.OOPs.java;


class Book extends Product{
	int isbn;
	String Auther;
	String title;
	Book(int isbn,String Auther,String title){
		super(500);
		this.isbn=isbn;
		this.Auther=Auther;
		this.title=title;
	}
	public void show() {
		System.out.println("The isbn no is " +this.isbn);
		System.out.println("The auther name " +this.Auther);
		System.out.println("The book title is " +this.title);

	}
}