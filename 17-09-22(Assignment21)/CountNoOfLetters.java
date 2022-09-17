
package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CountNoOfLetters {
  public static void main(String args[]) throws IOException {
		FileOutputStream fout2 = new FileOutputStream("test2.txt");
		String s="I am learning file handling";
		byte b[]=s.getBytes();
		fout2.write(b);
		fout2.close();

//	
		
		FileInputStream fin=new FileInputStream("test2.txt");
		int i=0;
		int count=0;
		while((i=fin.read())!=-1) { 
				if(i!=' ') {
					 count++;
				}
			 
		}
		System.out.println("The total no of letters in this file " +count);
		fin.close();
		
		
  }
}
