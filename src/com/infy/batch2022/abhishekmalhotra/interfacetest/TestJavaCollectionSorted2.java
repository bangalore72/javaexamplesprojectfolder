package com.infy.batch2022.abhishekmalhotra.interfacetest;

import java.util.*;

import com.infy.batch2022.abhishekmalhotra.Address;


public class TestJavaCollectionSorted2 {
	public static void main(String args[]) {
		TreeSet<String> list = new TreeSet<String>();// Creating arraylist
		list.add("z");// Adding object in arraylist
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		 
		 
		
		
		//Traversing list through Iterator  
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	 
	
}