package com.exception;

 class AccountExp {
  int balance;
  AccountExp(int balance){
	  this.balance=balance;
	  balance=500;
	  System.out.println("Your first account balance is " +this.balance);
  }
  public void deposit(int damt) {
	  this.balance=this.balance+damt;
	  System.out.println("Your deposit amount is " +damt);
	  System.out.println("Now your account balance is  " +this.balance);

  }
  public void withdraw(int wamt) throws LessBalanceException{
	  if(this.balance-wamt < 500) {
		  throw new LessBalanceException("Opps your withdraw amount is " +wamt+ " which is more then the balance");
	  }
	  else {
		  this.balance=this.balance-wamt;
		  System.out.println("Your withdraw amount is " +wamt);
		  System.out.println("Now your account balance is  " +this.balance);

	  }
  }
  public static void main(String args[]) {
	  AccountExp obj = new AccountExp(2000);
	  obj.deposit(2000);
	  
	  try {
		  obj.withdraw(6600);
	  }
	  catch(Exception e) {
		  System.out.print(e.getMessage());

	  }
  }
}
