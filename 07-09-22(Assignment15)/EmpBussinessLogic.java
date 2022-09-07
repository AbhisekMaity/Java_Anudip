package com.JUnit_Testing;

public class EmpBussinessLogic {
	public double calculateYearlySal(EmployeeDetails emp) {
		double yearlySalary=0;
		yearlySalary=emp.getMonthlySalary()*12;
		return yearlySalary;
		
	}
	public double calculateAppraisal(EmployeeDetails emp) {
		 double appraisal=0;
		if(emp.getMonthlySalary()<10000) {
			appraisal=500;
		}
			else {
				appraisal=1000;
			}
		return appraisal;
		}
	}

