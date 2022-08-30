/*
 * Create a class complex having a real part(x) and an imaginary part(y). Provide methods to perform the following on complex numbers:

1. Add two complex numbers
2. Multiply two complex numbers

Note: In the methods pass the object of type complex and then do the addition and multiplication

Hint: you need to add the passed object with thr current object and same for multiplication
 */
package com.OOPs.java;

public class ComplexNumber {
	double real;
	double img;
	ComplexNumber(double real,double img){
		this.real=real;
		this.img=img;
	}

public static void main(String args[]) {
	ComplexNumber com1=new ComplexNumber(23,56);
	ComplexNumber com2=new ComplexNumber(23,56);
    double addreal=com1.real + com2.real;
    double addimg=com1.img+com2.img;
    
    System.out.println("After addition the complex number is "+addreal+ " + " +addimg+"i");
    
    double mulreal=com1.real * com2.real;
    double mulimg=com1.img*com2.img;
    
    System.out.println("After multiplication the complex number is "+mulreal+ " + " +mulimg+"i");
}
}
