package com.infy.batch2022.abhishekmalhotra.streams;

 
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamsNonReusableDemo {

	double PRICE_PER_UNIT_PER_CALL = 1;
	
	public static void main(String args[]) {
        
        /**
		 * Scenario #1
		 */
		Stream<String> langNames1 = Stream.of("Java","Python","C++","C","C#","Dot Net");
		
		List<String> tempList = langNames1.collect(Collectors.toList());
		
		tempList.stream().filter(name -> name.charAt(0)=='C')
        .sorted()                                   
        .forEach(name -> System.out.println(name));
		
		
		/*
		
		//Stream Operation #1
		langNames1.filter(name -> name.charAt(0)=='C')
		          .sorted()                                   
		          .forEach(name -> System.out.println(name));
		
		//Line1
		//Stream Operation #2
		langNames1.map(name -> name.toLowerCase())
		          .forEach(name-> System.out.println(name));
		         
		*/
		
		
		tempList.stream().map(name -> name.toLowerCase())
        .forEach(name-> System.out.println(name));
		
		
		
		//Comment Scenario 1 and Uncomment Scenario 2!
		/**
		 * Scenario #2
		 */
	    Stream<String> langNames2 = Stream.of("Java","Python","C++","C","C#","Dot Net");
		
		//Stream Operation #1
		langNames2.filter(name -> name.charAt(0)=='C')
		          .sorted();                                   //Line2
		
		//Stream Operation #2
		langNames2.map(name -> name.toLowerCase())
		          .forEach(name-> System.out.println(name));         
	}
}