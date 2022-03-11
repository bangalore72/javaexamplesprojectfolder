package com.infy.batch2022.abhishekmalhotra.interfacetest;

import java.util.*;

import com.infy.batch2022.abhishekmalhotra.Address;

class TestJavaCollection1 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		//---
		// Add your code here : 
		String s = "Abhishek";
		
		list.add(0, s);
		 
		int[] myarr = { 1, 2 };
		
		Address[] empmyarr = new Address[2];
		
		ArrayList list1 = new ArrayList();
		
		list1.add(new Integer(1));
		list1.add(new Address());
		list1.add("test1" );
		
		
		ArrayList<String> list2 = new ArrayList<String>();// Creating arraylist
		list2.add("x"); 
		list2.add("y");
		list2.add("z");
		 
		// combine both the list into one list
		list.addAll(list2);
		
		//If the list contains "Ajay" retreive only that and print it
		
		//sort it and print it
		
		//Collections.sort(list);
		
		
		String longest = findLongestString(list);
		
		System.out.println("Size is "+ longest.length());
		
		
		
//Traversing list through Iterator  
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
	public static String findLongestString(List list) {
		String longest = "";
		for (Object object : list) {
			
			if(object instanceof String)
			{
				String s = (String)object;
				if(s.length() > longest.length()) //Line1
					longest = s;
			}
			
		}
		
		System.out.println("The string having the maximum length is "+ longest);
		
		return longest;
		
		
		
	}
	
}


// add a new element "Deep, Abshiek  as the first element" //