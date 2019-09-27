package com.cg.lab9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab9Ex3 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[] {43,45,67,34,67};
		System.out.println(getSquares(array));
		sc.close();
	}
	
	public static Map<Integer,Integer> getSquares(int[] array) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++) {
			map.put(array[i], (int) Math.pow(array[i], 2));
		}
		return map;
	}

}
