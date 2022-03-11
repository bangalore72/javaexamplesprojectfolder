package com.infy.batch2022.abhishekmalhotra.interfacetest;

import java.util.*;

import com.infy.batch2022.abhishekmalhotra.Address;



class SortByLength implements Comparator<String>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(String a, String  b)
    {
        return a.length() - b.length();
    }
}



class TestJavaCollectionSimple {
	

	
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Zahid");
		list.add("Shadab");// Adding object in arraylist
		list.add("Viritha");
		list.add("Ajay");

		
		// Traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("\n---------For Loop----------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("\n---------ForEach----------");
		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("\n---------ListIterator----------");
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("Iterating through Streams");
		list.stream().forEach((a) -> System.out.println(a));

		
		  
		
		list.stream().forEach(System.out::println);
		 
		 
		Collections.sort(list);
		  

		System.out.println("---Sorted ---");
		
		
		list.stream().forEach(System.out::println);
		
		Collections.sort( list , new SortByLength());
		
		
		System.out.println("---Sorted by length ---");
		
		
		list.stream().forEach(System.out::println);
		
		
		System.out.println("---Sorted by length -1 ---");
		
		
		list.sort(Comparator.reverseOrder());
		
		
		
	}

	
}

// add a new element "Deep, Abshiek  as the first element" //