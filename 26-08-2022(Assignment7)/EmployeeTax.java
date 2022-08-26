package com.OOPs.java;

import java.util.Scanner;

public class EmployeeTax {
	public static void main(String args[]) {
		Employee12 obj = new Employee12("hfdjk66","kjfka",400000);
		Scanner sc = new Scanner(System.in);
//		String a=sc.next();
//		String b=sc.nextLine();
//		double c=sc.nextDouble();
//		System.out.println("Please enter pan no (String) ");
//		obj.setPanNo(a);
//
//		obj.setName(b);
//		System.out.println("Please enter Name (String) ");
//
//		
//		obj.setIncome(c);
//		System.out.println("Please enter Income yearly  ");

//		obj.setPanNo("34662wer");
//		obj.setName("Abhisek");
//		obj.setAnIncome(256000.0);
		
		
//		System.out.println("PanCardNo : " +obj.getPanNo()+ " PersonName : " +obj.getName()+ " Income : " +obj.getIncome()+ " TaxRate : " +obj.cal());
		System.out.println("PanCardNo : " +obj.getPanNo()+ " PersonName : " +obj.getName()+ " Income : " +obj.getIncome());
     obj.cal();
     obj.dis();
		
		
		
		
	}

}
