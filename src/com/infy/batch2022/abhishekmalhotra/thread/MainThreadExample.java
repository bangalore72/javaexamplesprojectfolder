package com.infy.batch2022.abhishekmalhotra.thread;

public class MainThreadExample implements Runnable {


	static int bankBalance = 0;
	 
	public static void main(String[] args) {

		
		MainThreadExample mainThreadObj = new MainThreadExample();
		
		
		Thread childThread = new Thread(mainThreadObj);

		childThread.start();

		
		try {
			
			for(int i = 0 ; i < 100 ; i++)
			{
				//System.out.println("Main Thread : " + " " + i);
				
				Thread.currentThread().sleep(1);
				
				increment();
				
			}
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
		System.out.println("Bank Balance" + " " + bankBalance );
		
	}
	
	public static void increment()
	{
		 
		{
			bankBalance++;
		}
		
	}

	public static void decrement()
	{
	 
		{
			bankBalance--;
		}
		
	}
	
	
	public void run() {
		System.out.println("This code is running in a thread");
		try
		{
			for(int i = 0 ; i < 100 ; i++)
			{
				System.out.println("child Thread : " + " " + i);
				
				if( i == 5)
				{
					Thread.currentThread().stop();
					
				}
				
				
				decrement();
				
				Thread.currentThread().sleep(1);
			}
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
	}
}