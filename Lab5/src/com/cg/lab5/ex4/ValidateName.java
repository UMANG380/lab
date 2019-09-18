package com.cg.lab5.ex4;

public class ValidateName {
	
	public static void validateFirstName(String fname) throws UserException {
		if(fname.length()<1) {
			throw new UserException("Invalid First Name");
		}
		
	}
	public static void validateLastName(String lname) throws UserException {
		if(lname.length()<1) {
			throw new UserException("Invalid Last Name");
		}
		
	}

}
