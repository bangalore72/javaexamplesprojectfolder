package com.infy.batch2022.abhishekmalhotra.streams;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleMapStream {

	public static void main(String[] args)
	{
		  // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
  
        
        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream
        list.stream().filter(number -> number > 9 ).forEach( e -> System.out.println( e));
         
        
        System.out.println(" --Next --");
        
        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream
        List filteredList = 
        		list.stream().filter(number -> number > 9 ).collect(Collectors.toList());
         
        
        filteredList.stream().forEach(System.out::println);
        
        System.out.println(" --end --");
        
        
        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream
        list.stream().map(number -> number * 3).forEach(System.out::println);
        
        System.out.println(" --end p--p --");
        
        Stream.of(11, 22, 3, 4, 5, 6, 7, 8, 9, 10)
        .sorted()
        .forEach(System.out::println );
        
        
        
	}

}
