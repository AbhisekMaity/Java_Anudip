package com.ds.java;
import java .util.Scanner;
enum Month {
	jan,feb,mar,apr,may,jun
	
}

public class Enummm2 {
	 Month m;
	Enummm2(Month m){
		this.m=m;
	}
	void display() {
		System.out.println(this.m);
	}
public static void main(String args[]) {
//	Enummm2 em = new Enummm2(Month.apr);
	Scanner sc = new Scanner(System.in);
	int n;
	n=sc.nextInt();
	
	switch(n) {
	case 1: {
		Enummm2 em1 = new Enummm2(Month.jan);
		em1.display();
		break;

	}
	case 2: {
		Enummm2 em2 = new Enummm2(Month.feb);
		em2.display();
		break;
	}
	case 3: {
		Enummm2 em3 = new Enummm2(Month.mar);
		em3.display();
		break;
	}
	case 4: {
		Enummm2 em4 = new Enummm2(Month.apr);
		em4.display();
		break;
	}
	case 5: {
		Enummm2 em5 = new Enummm2(Month.jun);
		em5.display();
		break;
	}
	case 6: {
		Enummm2 em6 = new Enummm2(Month.feb);
		em6.display();
		break;
	}
	default : {
		System.out.println("Wrong input ");
		break;
	}
	}
}
}
