package com.cg.lab5.ex2;

public class Fibonacci {
	
	 static int fibonacciLoop(int n) 
	    { 
	    
	    int f[] = new int[n+2]; 
	    int i; 
	       
	   
	    f[0] = 0; 
	    f[1] = 1; 
	      
	    for (i = 2; i <= n; i++) 
	    { 
	      
	        f[i] = f[i-1] + f[i-2]; 
	    } 
	       
	    return f[n]; 
	    } 
	static int fibonacciRecursion(int n) 
	{ 
	if (n <= 1) 
	   return n; 
	return fibonacciRecursion(n-1) + fibonacciRecursion(n-2); 
	} 
    public static void main (String args[]) 
    { 
     int n = 9; 
     int x =10;
     System.out.println(fibonacciRecursion(n));
     System.out.println(fibonacciLoop(x));
    } 
}


