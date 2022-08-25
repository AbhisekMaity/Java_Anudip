package com.OOPs.java;


class Employee{
	String name;
	int year;
	String address;
	int Salary;
	public void display(String name,int year,String address,int Salary) {
		this.name=name;
		this.year=year;
		this.address=address;
		this.Salary=Salary;
		
		System.out.println(name+ "  " + year+ "  " +Salary+ "  " +address);
		
	}
}