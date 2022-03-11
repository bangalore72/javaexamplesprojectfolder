package com.infy.batch2022.abhishekmalhotra.streams;




import java.util.*;


import java.util.stream.Collectors;



public class MapStreamUpperCase {

	public static void main(String[] args) {


		// Creating a list of Integers
        List<String> list = Arrays.asList("abc", "gfg", "g",
                                          "e", "e", "k", "s");
  
        // Using Stream map(Function mapper) to
        // convert the Strings in stream to
        // UpperCase form
        List<String> answer = list.stream().map(String::toUpperCase).
        		collect(Collectors.toList());
  
        // displaying the new stream of UpperCase Strings
        System.out.println(answer);
        
        

	}

}
