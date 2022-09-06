package com.OOPs.java;

 class Result extends Students implements Exam {
	 double per;
	 Result(){
		 super("Abhisek",202,99,99);
		 }
  public void Percent_cal() {
	  this.per=per;
	  per=(marks1+marks2)/2;
  }
  public void display() {
	  System.out.println("The student percentage marks is "+this.per);
   }
 }
  