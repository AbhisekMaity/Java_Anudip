package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrintVowles {
  public static void main(String args[]) throws IOException {
		FileOutputStream fout2 = new FileOutputStream("test2.txt");
		String s="I am learning file handling";
		byte b[]=s.getBytes();
		fout2.write(b);
		fout2.close();

//		FileInputStream fin=new FileInputStream("test2.txt");
//		int i=0;
//		while((i=fin.read())!=-1) { 
//			if((char)i=='a'||(char)i=='e'||(char)i=='i'||(char)i=='o'||(char)i=='u'||(char)i=='A'||
//					(char)i=='E'||(char)i=='I'||(char)i=='O'||(char)i=='U') {
//			System.out.println((char)i);
//			}
//		}
//		fin.close();
		
		FileInputStream fin=new FileInputStream("test2.txt");
		int i=0;
		while((i=fin.read())!=-1) { 
			if(i==97||i==101||i==105||i==111||i==117||i==65||
					i==69||i==73||i==79||i==85) {
			System.out.println((char)i);
			}
		}
		fin.close();
		
		
  }
}
