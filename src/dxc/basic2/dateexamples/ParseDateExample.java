package dxc.basic2.dateexamples;


import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
  


public class ParseDateExample {

	 public static void main(String[] args)
	    {
	  
	        // Parses the date
	        LocalDate dt = LocalDate.parse("2018-11-01");
	        System.out.println(dt);
	  
	        // Function call
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	        System.out.println(formatter.format(dt));
	    }
	 
	 
}
