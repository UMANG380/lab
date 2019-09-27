package com.cg.lab.lab10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread {
	
	FileInputStream fileInputStream=null;
	FileOutputStream fileOutputStream=null;
	
	public CopyDataThread(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
		super();
		this.fileInputStream = fileInputStream;
		this.fileOutputStream = fileOutputStream;
	}
	public void start() throws InterruptedException {
		int a=0;
		int count=0;
		try {
			while((a=fileInputStream.read())!=-1) {
				char c=(char)a;
				fileOutputStream.write((byte)c);
				fileOutputStream.flush();
				count++;
				if(count==10) {
					System.out.println("10 characters are copied");
					count=0;
					Thread.sleep(5000);
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	

}
