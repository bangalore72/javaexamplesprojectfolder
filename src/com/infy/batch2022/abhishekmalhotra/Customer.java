package com.infy.batch2022.abhishekmalhotra;


public class Customer {
	 private int customerId;
	 private String name;
	 private String phone;
	 
	 public Customer(int id, String name, String phone) {
	     //code here
		 this.customerId = id;
		 this.name = name;
		 this.phone = phone;
	 }
	 
	
	 public String toString() {
		 
		 String s = " $$$  name :  "   + this.name + " $$$  id " + this.customerId ;
		 
		 //System.out.println( s);
		 
		 return s;
	
		 
	 }
	 
	 
	 /*
	 public String toString(String x) {
		 
		 String s = " $$$  name :  "   + this.name + " $$$  id " + x ;
		 
		 //System.out.println( s);
		 
		 return s;
	 }
	 */
 
	  // code equals and hashCode here

	 
	 
	 public boolean equals(Object anObject) {    
	      if (this == anObject) {    
	          return true;    
	      }    
	      
	      boolean notEqualsFlag = false;
	      
	      if (anObject instanceof Customer) {    
	    	  Customer  otherCust = (Customer) anObject;    
	    	  
	          if(this.name.equals( otherCust.name) == false)
	          {
	        	  notEqualsFlag = true;
	          }
	           
	          if( notEqualsFlag  == true)
	          {
	        	  return false;
	        	  
	          }
	          if(this.customerId  != otherCust.customerId)
	          {
	        	  notEqualsFlag = true;
	          }
	           
	          if( notEqualsFlag  == true)
	          {
	        	  return false;
	        	  
	          }
	          
	          if(this.phone  != otherCust.phone)
	          {
	        	  notEqualsFlag = true;
	          }
	          
	          if( notEqualsFlag  == true)
	          {
	        	  return false;
	        	  
	          }
	          
	          
	      }    
	      
	      return true;  
	  }    
	

	 
	 @Override
	 public final int hashCode() {
	     int result = 17;
	     if (name != null) {
	         result = 31 * result + name.hashCode();
	     }
	      
	     return result;
	 }
	 
	 
	 
	 public static void main(String[] args) {
	     Customer c1 = new Customer(105, "Max", "8574637282");
	     Customer c2 = new Customer(105, "Max", "8574637282");
	     
	     Customer c3 = c1;
	     
	     
	      
	     if( c1.equals(c3))
	     {
	    	 System.out.println( "c1 equals c2 ");
	     }
	     else
	     {
	    	 System.out.println( "c1 not equals c2 ");
 
	     }
	     
	     System.out.println( c1 );
	     
	     System.out.println( c1.toString() );
	     
	     //System.out.println( c1 );
	     
	     
	     
	     
	 }
}
