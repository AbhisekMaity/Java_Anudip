package com.java;

public class quadraticEqu {
 public static void main(String args[]) {
	 double a=1;
	 double b=5;
	 double c=1;
	 double dec=b*b - 4.0*a*c;
	 double root_1;
	 double root_2;
	 if(dec > 0.0) {
		 root_1=(-b +Math.pow(dec,0.5))/(2.0*a);
		 root_2=(-b -Math.pow(dec,0.5))/(2.0*a);
		 System.out.println("The root values are ");

		 System.out.println("Root_1 = "+root_1);
		 System.out.println("Root_2 = "+root_2);
		 
	 }
	 else if(dec == 0.0) {
		 System.out.println("Both root value are same");
		 root_1=(-b +Math.pow(dec,0.5))/(2.0*a);
		 root_2=(-b -Math.pow(dec,0.5))/(2.0*a);
		 System.out.println("The root values are ");

		 System.out.println("Root_1 = "+root_1);
		 System.out.println("Root_2 = "+root_2);
		 
	 }
	 else {
		 System.out.println("Roots are no real");
	 }
	
  }
}
