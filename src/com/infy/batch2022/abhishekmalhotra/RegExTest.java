package com.infy.batch2022.abhishekmalhotra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

	 

	public static void main(String[] args) {
	 
		
		String name = "Leeroy Jenkins";
		
		String badname = "LeeroyJenkins'$JR";
		
		String nameRegex = "([A-Za-z ]+)";
		 
		 //Validating Name:
        System.out.println("Does the name ("+name+") match the pattern? : "+name.matches(nameRegex));
        
        //Validating Name:
        System.out.println("Does the name ("+badname+") match the pattern? : "+name.matches(nameRegex));
       
        
		 
		//Creating a Pattern through Regular Expression 
        String regex = "Tools1";
        

		//String to be compared with RegEx 
		String input = "Welcome to the firstday of Java , Hello Tools everyone";
		
		
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        
        boolean matchFound = matcher.find();
        
        //Pattern Matching done using matches() method
        System.out.println( "matchFound  :" + matchFound);
			
		 
		//Pattern Matching done using Pattern.matches() method
		System.out.println(Pattern.matches(regex, input));
		
		
		
		
		 //Splitting Full Name Into an Array:
        String[] inputSplit = input.toLowerCase().split(" ");
        
      
       
      	System.out.println(inputSplit);
	}
      		

}
