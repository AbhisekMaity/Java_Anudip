package com.OOPs.java;
class Employee12{
	String PanNo;
	String Name;
	double income;
	double TaxRate;
	Employee12(String PanNo,String Name,double income){
		this.PanNo=PanNo;
		this.Name=Name;
		this.income=income;
		
	}
	public void setPanNo(String PN) {
		PanNo=PN;
	}
	public void setName(String NM) {
		Name=NM;
	}
	public void setIncome(double inc) {
		income=inc;
	}
	public void cal() {
		if(income<=100000) {
			this.TaxRate=0.0;
		}
		else if(income>=100001 && income<=150000) {
			this.TaxRate=income*0.1;
		}
		else if(income>=150001 && income<=250000) {
			this.TaxRate=5000+income*0.2;
		}
		else {
			this.TaxRate=25000+income*0.3;
			}
		}
	
	public void dis() {
		System.out.println("TaxRate is : " +TaxRate);

	}
	public String getPanNo() {
		return PanNo;
		}
	public String getName() {
		return Name;
	}
	public double getIncome() {
		return income;
	}

}