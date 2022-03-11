package com.infy.batch2022.abhishekmalhotra.interfacetest;

import java.util.*;
import java.util.stream.Collectors;

public class QueueTest {

	public static void main(String[] args) {
		// declare a Queue
		Queue<String> str_queue = new LinkedList<>();
		// initialize the queue with values
		str_queue.add("one");
		str_queue.add("two");
		str_queue.add("three");
		str_queue.add("four");

		// print the Queue
		System.out.println("The Queue contents:" + str_queue);
		
		
		Iterator itr = str_queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		str_queue.forEach(e -> System.out.println(e));
		
		List list 
			= str_queue.stream().filter( e-> e.equalsIgnoreCase("two")).collect(Collectors.toList());
		
		
		Iterator itr1 = list.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
	}
}
