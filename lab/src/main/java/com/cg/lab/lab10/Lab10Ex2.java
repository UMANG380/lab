package com.cg.lab.lab10;

import java.util.Date;

public class Lab10Ex2 implements Runnable {
	
			public void run() {
			
			while(true) {
				Date d=new Date(0);
				System.out.println(d);
				try {
					Thread.sleep(10000);
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
		}
		
		public static void main(String[] args) {
			Lab10Ex2 tr=new Lab10Ex2();
			Thread t=new Thread(tr);
			t.start();
		}
	}


	
	

