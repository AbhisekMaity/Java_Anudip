package com.OOPs.java;


class Employee1{
	String firstName;
	String lastName;
	double salary;
	Employee1(String fName,String lName,double sal){
		firstName=fName;
		lastName=lName;
		if(sal > 0.0) {
			salary=sal;
		}
		else {
			salary=0.0;
		}
		
	}
	public void setfirstName(String fName) {
		firstName=fName;
	}
	public void setlastName(String lName) {
		lastName=lName;
	}
	public void setSalry(double sal) {
		if(sal > 0.0) {
			salary=sal;
		}
		else {
			salary=0.0;
		}
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public double getMonthSalary() {
		return salary;
	}
	public double getYearlySalary() {
		return salary*12.0;
	}

}