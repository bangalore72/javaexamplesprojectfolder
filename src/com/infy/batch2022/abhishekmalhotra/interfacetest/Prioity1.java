package com.infy.batch2022.abhishekmalhotra.interfacetest;
import java.util.PriorityQueue;

public class Prioity1 {

	

	    public static void main(String[] args) {

	        // Creating a priority queue
	        PriorityQueue<Integer> numbers = new PriorityQueue<>();

	        // Using the add() method
	        numbers.add(4);
	        numbers.add(2);
	        System.out.println("PriorityQueue: " + numbers);

	        // Using the offer() method
	        numbers.offer(1);
	        System.out.println("Updated PriorityQueue: " + numbers);
	    }

}
