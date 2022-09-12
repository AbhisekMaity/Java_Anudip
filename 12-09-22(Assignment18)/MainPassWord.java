/*
 * 2. Write a program to accept a password from the
 *  user and throw 'Authentication Failure' 
 * exception if the password is incorrect.
 */
package com.strings;
import java.util.Scanner;
public class MainPassWord { 
	public static void matchPassword(String pw) throws AuthenticationFailureException {
		String password="Abhi123";
		if(!(password.equals(pw))){
			throw new AuthenticationFailureException("Opps!!! incorrect password ");
		}
		else {
			System.out.println("Yes your password is correct ");
		}
	}
  public static void main(String args[]) {
	  MainPassWord obj=new MainPassWord();
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter the password");
	  String pw=sc.next();
	  try {
		  MainPassWord.matchPassword(pw);
	  }
	  catch(AuthenticationFailureException e){
			System.out.println( e.getMessage());
		  
	  }
  }
}
