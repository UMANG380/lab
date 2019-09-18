package com.cg.lab5.ex1;

import java.util.Scanner;

public class TrafficLight {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
	    
		String colour;
		
		System.out.println("Enter the choice");
		
		colour = sc.next();
		
		if(colour=="Red") {
			System.out.println("Stop");
			
		}
		else if(colour=="Yellow") {
			System.out.println("Ready");
		}
		else {
			System.out.println("Go");
		}
		
		
	}

}
