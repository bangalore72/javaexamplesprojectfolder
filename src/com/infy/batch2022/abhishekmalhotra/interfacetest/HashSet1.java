package com.infy.batch2022.abhishekmalhotra.interfacetest;

import java.util.*;

class HashSet1 {
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		Set<String> set = new HashSet();
		
		set.add("Four");
		set.add("One");
		set.add("Two");
		set.add("Three");
		
		set.add("Five");

		set.add("Five");
		set.add("Five");
		set.add("Five");

		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("-----" );
		
		
		for(String str : set){
		   System.out.println(str);
		}

		
		
	}
}