package com.java;

public class quadraticEqu {
 public static void main(String args[]) {
	 double a=1;
	 double b=1;
	 double c=1;
	 double dec=b*b - 4.0*a*c;
	 if(dec > 0.0) {
		 double root1=(-b +Math.pow(dec,0.5))/(2.0*a);
		 double root2=(-b -Math.pow(dec,0.5))/(2.0*a);
		 System.out.println("Root_1 = "+root1);
		 System.out.println("Root_2 = "+root2);
		 
	 }
	 else if(dec == 0.0) {
		 System.out.println("Both root value are same");
	 }
	 else {
		 System.out.println("Roots are no real");
	 }
	
  }
}
