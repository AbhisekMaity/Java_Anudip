package com.OOPs.java;
class Invoice{
	String partNo;
	String partDescription;
	int quantity;
	double price;
	Invoice(String pNo,String partDes,int qty,double prc){
		if(pNo!=null) {
			partNo=pNo;
		}
		else {
			partNo="0";
		}
		
		if(partDes!=null) {
			partDescription=partDes;
		}
		else {
			partDescription="0";
		}
		if(qty > 0) {
			quantity=qty;
		}
		else {
		quantity=0;
		}
		if(prc>0.0) {
			price=prc;
		}
		else {
			price=0.0;
		}
	}
		
		public String getpartNo() {
			return partNo;
		}
		public String getDescription() {
			return partDescription;
		}
		
		public int getquantity() {
			return quantity;
		}
		
		public double getprice() {
			return price;
		}
		public void setPartNo(String pNo) {
			if(pNo!=null) {
				partNo=pNo;
			}
			else {
				partNo="0";
			}
		
		 }
		
		public void setDescription(String partDes) {
			if(partDes!=null) {
				partDescription=partDes;
			}
			else {
				partDescription="0";
			}
			
		 }
		public void setquantity(int qty) {
			if(qty > 0) {
				quantity=qty;
			}
			else {
			quantity=0;
			}
			
		 }
	 public void setprice(double prc) {
		 if(prc>0.0) {
				price=prc;
			}
			else {
				price=0.0;
			}
		
		 }
	 public double getInvoiceAmount() {
		 return (double)quantity*price;
	}
}

