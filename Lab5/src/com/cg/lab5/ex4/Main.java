package com.cg.lab5.ex4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fname=null;
		String lname;
		System.out.println("Enter first name");
		fname = sc.next();
		try {
			ValidateName.validateLastName(fname);
		}catch(UserException u) {
			System.out.println("Invalid First Name");
		}
	}

}
