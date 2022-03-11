package com.infy.batch2022.abhishekmalhotra.lambdaexpress;


interface FuncInterExample
{
	int doadd(int a, int b);
}

 
class FuncInterExampleImpl implements FuncInterExample
{

	@Override
	public int doadd(int a, int b) {
		 
		return a+b;
	}
	
}

 

public class Test2 {
 
	public static void main(String args[])
	{
		 
		FuncInterExample obj = new FuncInterExampleImpl();
		int result = obj.doadd(3, 5);
		System.out.println( result);
		 
		
		FuncInterExample x = 
				new FuncInterExample()
		 {

			@Override
			public int doadd(int a, int b) {
				 
				return a+b;
			}
			 
		 };
		 
		 int result2 = x.doadd(4, 6);
		System.out.println( result2);
	}
	
	
	
}
