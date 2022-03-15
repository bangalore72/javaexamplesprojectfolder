package com.infy.batch2022.abhishekmalhotra.lambdaexpress;

 
//Java program to demonstrate working of lambda expressions
public class TestFunctionalInterface
{
	// operation is implemented using lambda expressions
	interface FuncInter1
	{
		int operation(int a, int b);
	}

	// sayMessage() is implemented using lambda expressions
	// above
	interface FuncInter2
	{
		void sayMessage(String message );
	}
	
	
	 
	interface FuncInter3
	{
		void sayMessage(String a, String b );
	}
		

	// Performs FuncInter1's operation on 'a' and 'b'
	private int operate(int a, int b, FuncInter1 fobj)
	{
		return fobj.operation(a, b);
	}

	
	public static void main(String args[])
	{
		// lambda expression for addition for two parameters
		// data type for x and y is optional.
		// This expression implements 'FuncInter1' interface
		FuncInter1 add = (int x, int y) -> x + y;

		// lambda expression multiplication for two parameters
		// This expression also implements 'FuncInter1' interface
		FuncInter1 multiply = (int x, int y) -> x * y;

		// Creating an object of Test to call operate using
		// different implementations using lambda Expressions
		TestFunctionalInterface tobj = new TestFunctionalInterface();

		// Add two numbers using lambda expression
		System.out.println("Addition is " +
						tobj.operate(6, 3, add));

		// Multiply two numbers using lambda expression
		System.out.println("Multiplication is " +
						tobj.operate(6, 3, multiply));

		// lambda expression for single parameter
		// This expression implements 'FuncInter2' interface
		FuncInter2 fobj = message -> System.out.println("Hello "
												+ message);
		fobj.sayMessage("Geek");
		
		
		
		FuncInter3 fobj3 = ( x , y ) -> System.out.println("Hello "
														+ x + " " + y);
		
		fobj3.sayMessage("newData " , " param");
				
				
				
	}
}
