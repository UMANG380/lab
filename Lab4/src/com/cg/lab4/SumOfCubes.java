package com.cg.lab4;

public class SumOfCubes {
	
	public static void cube(int n) {
		int temp;
		int s=0;
		
		while(n>0) {
			temp = n%10;
			s=s+(temp*temp*temp);
			n=n/10;
			
						
		}
		System.out.println("Sum Of Cubes:"+s);
	}	
	public static void main(String args[]) {
		
		cube(2342);
		
	}


	
}
