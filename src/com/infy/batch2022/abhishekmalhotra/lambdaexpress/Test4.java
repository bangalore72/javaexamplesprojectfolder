package com.infy.batch2022.abhishekmalhotra.lambdaexpress;

 
//Java program to demonstrate working of lambda expressions
public class Test4
{ 
	interface FuncInter3
	{
		String sayMessage(String a, String b );
	}
		
 
	public static void main(String args[])
	{
		  
		FuncInter3 fobj3 = ( x , y ) -> {
					return  "Hello "+ x + " " + y;
				};
														
		
		String x = fobj3.sayMessage("newData " , " param");
				
		System.out.println( x)	;
		
				
	}
}
