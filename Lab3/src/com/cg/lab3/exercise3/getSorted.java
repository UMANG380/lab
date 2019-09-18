package com.cg.lab3.exercise3;

import java.util.Arrays; 

public class getSorted {
	public static void getSortedArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			int rev_num = 0; 
		    while(arr[i] > 0) 
		    { 
		        rev_num = rev_num*10 + arr[i]%10; 
		        arr[i] = arr[i]/10; 
		    }
		    arr[i]=rev_num;
		 }
		 Arrays.sort(arr);
	        for (int i = 0; i < n; i++) { 
	            System.out.println(arr[i]); 
	        } 
		}
	
	public static void main(String[] args) 
	{ 
		int [] arr = {14, 33, 37, 42, 58}; 
		getSortedArray(arr, arr.length); 
	} 
}


