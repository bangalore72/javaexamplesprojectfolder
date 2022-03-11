package com.infy.batch2022.abhishekmalhotra.lambdaexpress;
import java.util.ArrayList;

public class ArrayExample {


 
	  public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> System.out.println(n)
				    		  
	    				);
	    System.out.println(" -- regular older approach --"); 
	    
	    for(Integer  n :  numbers)
	    {  
	    	System.out.println(n); 
	    }  
	    
	    
	  }
 
}
