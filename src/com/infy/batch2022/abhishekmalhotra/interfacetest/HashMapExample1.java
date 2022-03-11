package com.infy.batch2022.abhishekmalhotra.interfacetest;

import java.util.HashMap;
import java.util.Map;

//import java.util.*;

public class HashMapExample1 {
	public static void main(String args[]) 
	{
		
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		
		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");

		map.put(3, "GrapesWine");
		
		
		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		String str = map.get(3);
		System.out.println( " 3th element :" +  str);
		
	}
		
}