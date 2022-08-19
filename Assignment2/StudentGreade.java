package com.java;

public class StudentGreade {
   public static void main(String args[]) {
	   int marks =65;
if(marks <=100) {
	   if(marks>=90) {
		   System.out.println("The Student grade is A+");
	   }
	   else if(marks >=80 && marks <90) {
		   System.out.println("The Student grade is A");

	   }
	   else if(marks >=70 && marks <80) {
		   System.out.println("The Student grade is B+");

	   }
	   else if(marks >=60 && marks <70) {
		   System.out.println("The Student grade is B");

	   }
	   else if(marks >=50 && marks <60) {
		   System.out.println("The Student grade is C");

	  }
	   else if(marks >=40 && marks <50) {
		   System.out.println("The Student grade is D");

	   }
	   else if(marks >=30 && marks <40) {
		   System.out.println("The Student grade is E");

	   }
	   else {
		   System.out.println("You are fail");
	   }
}
else {
	System.out.println("Please enter correct markes");
}
   }
}
