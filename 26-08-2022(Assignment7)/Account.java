package com.OOPs.java;
class Account{
	int id=0;
	double balance=0.0;
	double annualInterestRate=0.0;
	Account(){
		
	}
	Account(int id, double balance){
		this.id=id;
		this.balance=balance;
	}
	public void setBalnce(double balance) {
		this.balance=balance;
	}
	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
	}
	public void setId(int id) {
		this.id=id;
	}

	public double getbalance() {
		return this.balance=balance;
	}
	public double getMonthlyInterestRate() {
		return (annualInterestRate/100)/12;
	}
	public double getMonthlyInterest() {
		return this.balance*getMonthlyInterestRate();
	}
	public void withdraw(double Amount) {
		this.balance=this.balance-Amount;
	}
	public void deposit(double Amount) {
		this.balance=this.balance+Amount;
	}
	
}
