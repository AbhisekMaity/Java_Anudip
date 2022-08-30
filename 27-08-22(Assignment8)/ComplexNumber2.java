
/*
 
 * Create a class complex having a real part(x) and an imaginary part(y). Provide methods to perform the following on complex numbers:


1. Add two complex numbers

2. Multiply two complex numbers


Note: 

In the methods pass the object of type complex and then do the addition and multiplication

Hint:

you need to add the passed object with thr current object and same for multiplication

*/


package com.OOPs.java;

public class ComplexNumber2 {
	double real;
	double img;
	ComplexNumber2(double real,double img){
		this.real=real;
		this.img=img;
	}
	public static ComplexNumber2 sum(ComplexNumber2 c1,ComplexNumber2 c2) {
		ComplexNumber2 obj=new ComplexNumber2(0,0);
		obj.real=c1.real + c2.real; 
		obj.img=c1.img + c2.img;
		
		return obj;
	}
	public static ComplexNumber2 mul(ComplexNumber2 c1,ComplexNumber2 c2) {
		ComplexNumber2 obj2=new ComplexNumber2(0,0);
		obj2.real=c1.real * c2.real;
		obj2.img=c1.img * c2.img;
		return obj2;
	}

public static void main(String args[]) {
	
	ComplexNumber2 c1=new ComplexNumber2(23,56);
	
	ComplexNumber2 c2=new ComplexNumber2(23,56);
	
	ComplexNumber2 obj = sum(c1,c2);
	
	ComplexNumber2 obj2=mul(c1,c2);
	
	System.out.println("The sum of two complex number is " +obj.real+ "+" +obj.img+ "i");
	
	System.out.println("The multiplication of two complex number is " +obj2.real+ "+" +obj2.img+ "i");

     }
 }


