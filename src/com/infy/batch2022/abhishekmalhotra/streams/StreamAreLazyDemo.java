package com.infy.batch2022.abhishekmalhotra.streams;

 
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamAreLazyDemo {

	public static void main(String[] args) {
		
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		//Add forEach(num -> System.out.println(num)) after the map() and
		//observe the change!
		List filteredList  = intStream.filter(num ->  
			{ 
				System.out.println("I am in filter " + num);
				return num%2 != 0 ;
			}
		 ).map(num -> num*3).collect(Collectors.toList());
		
		
			filteredList.forEach(num -> System.out.println(num));
		
		}
		
	
}
 