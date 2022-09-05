/*
 * Create two user-defined exceptions named “TooHot” and “TooCold” to check the
temperature (in Celsius) given by the user passed  is too hot or too cold.
If temperature > 35, throw exception “TooHot”.
 If temperature <5, throw exception “TooCold”.
Otherwise, print “Normal” and convert it to Farenheit.
 */
package com.exception;
import java.util.Scanner;
 class MainToHotCold {
	 static void validTemp(int temp) throws TooHotException,ToClodException{
		   if(temp > 35) {
			   
			   throw new TooHotException("Wether is too hot");
		   }
		   else if(temp < 5) {
			   
			   throw new ToClodException("Temperature is too cold ");
		   }
		   else {
			   System.out.println("Temperature is normal ");
			   int fer;
		          fer =((temp*9)/5)+32; 
		          
				   System.out.println("The Farhenhite temperature is " +fer);

		   }
	  }
	  public static void main(String args[]) {
		  Scanner scc = new Scanner(System.in);
		  System.out.println("Please enter the cel temperature");
		  int a=scc.nextInt();
		  try {
			  MainToHotCold.validTemp(a);

		  }
		  catch(TooHotException he) {
			  System.out.print(he.getMessage());
		  }
		  catch(ToClodException ce) {
			  System.out.print(ce.getMessage());
		 
		  }
	  }
	}
