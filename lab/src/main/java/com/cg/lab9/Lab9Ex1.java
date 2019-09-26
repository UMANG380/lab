package com.cg.lab9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab9Ex1 {
	
public static void main(String args[]) {
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(1, 5);
		map.put(2, 10);
		map.put(3, 1234);
		map.put(4, 435);
		map.put(5, 130);
		map.put(6, 89);
		System.out.println(getValues(map));
		
	}
	
	public static List<Integer> getValues(Map<Integer, Integer> map){
		List<Integer> list = new ArrayList<Integer>(map.values());
		Collections.sort(list);
		return list;
	}

}
