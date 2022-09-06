/*
Consider a Quiz Management System, where a user needs to answer 5 questions. 
If any of the answer is wrong, throw an exception “NotCorrectException”. 
If the answer is correct give a message “good! The answer is correct”.
 */
package com.exception;
import java.util.Scanner;

public class MainNotCorrExp {
	public static void quest() 
			throws NotCorrectException{
		
			Scanner sc= new Scanner(System.in);
			String question[]= {"What is java ?","What is C ?","What is Sql ?","What is Pointer ?","What is DBMS ?"};
			String option1[]= {"Object Oriented Language",
					"Procedural Oriented Language","Structure Query Language",
					"Pointer is a Variable","Database Management System"};
			String option2[]= {"Procedural Oriented Language",
					"Object Oriented Language","Scripting Language",
					"Data Type","Data Collection"};
			int size=question.length;
			int i;
			for(i=0;i<size;i++) {
				String ques=question[i];
				System.out.println(ques);
				System.out.println(option1[i]);
				System.out.println(option2[i]);
				System.out.println("Enter your Choice ");
				String ch=sc.nextLine();
				
				
					if(!(ch.equals(option1[i]))) {
						throw new NotCorrectException("Sorry your ans is Wrong ");
					}
					else {
						System.out.println("Your answer is correct ");
					}
		
		}
	}
		
	public static void main(String args[]) {
		MainNotCorrExp obj = new MainNotCorrExp();
	
		try {
			obj.quest();
		}
		catch(NotCorrectException ec) {
			System.out.println(ec.getMessage());

		}
	}

}
