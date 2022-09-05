package com.exception;
class MainSalExp {
  static void validSal(int salary) throws InvalidSalaryException{
	   if(salary <=10000) {
		   
		   throw new InvalidSalaryException("Salary always between 10000 and 20000");
	   }
	   else if(salary >=20000) {
		   
		   throw new InvalidSalaryException("Salary always between 10000 and 20000");
	   }
	   else {
		   System.out.println("Yes you put correct salary");
	   }
  }
  public static void main(String args[]) {
	  try {
		  MainSalExp.validSal(15000);
	  }
	  catch(InvalidSalaryException e) {
		  System.out.print(e.getMessage());
	  }
  }
}
