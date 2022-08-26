/*
 * Design a class named Account that contains:

I. A data field named id for the account (default 0). 

II. A double data field named balance for the account (default 0).

III. A double data field named annualInterestRate that stores the current interest rate (default e).

IV. A Date data field named dateCreated that stores the date when the account was created.

V. A no-arg constructor that creates a default account.

VI. A constructor that creates an account with the specified id and initial balance.

IX. A method named getMonthly InterestRate() that returns the monthly interest rate.

X. A method named getMonthlyInterest() that returns the monthly interest.

XI. A method named withdraw that withdraws a specified amount from the account.

XII. A method named deposit that deposits a specified amount to the account.

Use the main class to display the result of all the methods created in the Account class.
 */
package com.OOPs.java;
public class AccountDetails {
	public static void main(String args[]) {
		Account obj =new Account(1002,50000);
		System.out.println("Now the account balnace :" +obj.getbalance());
		obj.setannualInterestRate(120);
		int amt=4000;
		System.out.println("The withdrawl amount is " +amt);
		obj.withdraw(amt);
		System.out.println("Monthly interest is " +obj.getMonthlyInterestRate());
		System.out.println("After withdrawl the account balance is " +obj.getbalance());
		
		
	}

}
