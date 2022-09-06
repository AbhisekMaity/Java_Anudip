package com.OOPs.java;

class Students {
 String name;
 int roll_no;
 double marks1;
 double marks2;
  Students(String name,int roll_no,double marks1,double marks2){
	  this.name=name;
	  this.roll_no=roll_no;
	  this.marks1=marks1;
	  this.marks2=marks2;
  }
  public void show() {
	  System.out.println("The student name is "+this.name);
	  System.out.println("The student roll_no is "+this.roll_no);
	  System.out.println("The student marks1 is "+this.marks1);
	  System.out.println("The student marks2 is "+this.marks2);

	  }
 
}
