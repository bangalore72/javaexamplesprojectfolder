package dxc.streamexamples.basic;


import java.util.stream.*;
import java.util.*;


public class StreamFlatMapExampleForInteger {
	
	
	public static void main(String[] args)
	{
		List<Integer> evenNumberList = List.of( 2, 4);
		
		List<Integer> oddNumberList = List.of( 3, 5);
		
		
		List<List<Integer>> ListOfInts 
		   = Arrays.asList(evenNumberList, oddNumberList );
		
		
		@SuppressWarnings("unchecked")
		List<Integer> flattenedList 
		   = (List<Integer>) ListOfInts.stream().
		   		flatMap( a -> ((List<Integer>) a).stream())
		   		.collect(Collectors.toList());
		
		
		flattenedList.forEach(System.out::println);
		
	}
	
	 
 
}
