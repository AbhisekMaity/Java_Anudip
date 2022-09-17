package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ReadDataFromTwoFile {
	public static void main(String args[]) throws IOException {
		FileInputStream fin = new FileInputStream("test.txt");
		  FileInputStream fin2 = new FileInputStream("test2.txt");
		  FileOutputStream fout2 = new FileOutputStream("Newtest.txt");
		  
		  SequenceInputStream inst=new SequenceInputStream(fin,fin2);
		  int i;
			while((i=inst.read())!=-1) {
				fout2.write(i);
			}
			
			System.out.println("New file created");
			
	}
}
