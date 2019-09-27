package com.cg.lab.lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		FileInputStream fileInputStream=new FileInputStream("a.txt");
		FileOutputStream fileOutputStream = new FileOutputStream("b.txt");
		CopyDataThread c=new CopyDataThread(fileInputStream,fileOutputStream);
		c.start();
	}

}
