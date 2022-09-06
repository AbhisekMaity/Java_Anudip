/*
 * Consider a Library Management System, where a user wants to find a book. If the
book is present in Library (Hint: Use predefined array), then it will print the book.
Otherwise it will throw an exception “BookNotFoundException”.
 */
package com.exception;
import java.util.Scanner;


public class MainBookLIb {
	public static void qestion(String str[],String bookName,int size) throws BookNotFoundException {
		int i, flag=0;
		for(i=0;i<size;i++) {
			if(bookName.equals(str[i])) {
				flag=1;
				break;
			}
			
		}
		
		if(flag==1)
		{
			System.out.println(" Yes this book is present on this Library ");

			}
			else {
				throw new BookNotFoundException("Ooo Sorry!!! this book is not avaliable on this library ");

			}
		
	}
	public static void main(String args[]) {
		String str[]= {"Java","Python","Algorithm","DBMS","DataStructure"};
		int size=str.length;
		System.out.println(" Library have the following books ");
		for(String val:str) {
			System.out.println(val);

		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the book name which you want to search");
		String bname=sc.nextLine();

		try {
			MainBookLIb.qestion(str,bname,size);
		}
		catch(BookNotFoundException ec) {
			System.out.println(ec.getMessage());

		}
	}

}

