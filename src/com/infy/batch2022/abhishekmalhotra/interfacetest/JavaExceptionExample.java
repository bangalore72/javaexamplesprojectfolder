package com.infy.batch2022.abhishekmalhotra.interfacetest;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavaExceptionExample
{  
	  public static void main(String args[]) throws Exception{  
		 
      try {
		FileReader file = new FileReader("somefile.txt");
	} 
      catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		throw new NullPointerException("");
		
	}
		 
		  
	   try{  
	      //code that may raise exception  
	      int data=100/0;  
	   }
	   finally
	   {
		   
	   }
	   //rest code of the program   
	   System.out.println("rest of the code...");  
	  }  
	}  
