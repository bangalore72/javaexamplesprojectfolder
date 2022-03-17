package dxc.streamexamples.basic;


import java.util.stream.*;
import java.util.*;


public class StreamFlatMapExample {
	
	
	public static void main(String[] args)
	{
		
		List<String> listStr =
				 Arrays.asList("A" , "F"  , "HelloWOrld ", " TestData");

		 
		listStr.stream().flatMap( num -> Stream.of(num)).forEach(
				System.out::println);
		
		
		
		
		List<String> listStr2 =
				 Arrays.asList("Z" , "Ragh"  , "Venkat ", "ramesh");

		 
		
		
		List<List> consolidatedList = new ArrayList<>();
		
		consolidatedList.add(listStr);
		consolidatedList.add(listStr2);
		
		
		 
		consolidatedList.stream().forEach(
				System.out::println);
		
		
		@SuppressWarnings("unchecked")
		List<String> flattenedList 
		   = (List<String>) consolidatedList.stream().
		   		flatMap( a -> ((List<String>) a).stream())
		   		.collect(Collectors.toList());
		
		
		flattenedList.forEach(System.out::println);
		
	}
	
	 
 
}
