package com.infy.batch2022.abhishekmalhotra.interfacetest;

public class MainThreadExample implements Runnable {

	static int bankBalance = 0;
	static private Object lock1 = new Object();
	
	public static void main(String[] args) {

		
		MainThreadExample mainThreadObj = new MainThreadExample();
		
		
		Thread childThread = new Thread(mainThreadObj);

		childThread.start();

		
		try {
			
			for(int i = 0 ; i < 10000 ; i++)
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
		//synchronized(lock1)
		{
			bankBalance++;
		}
		
	}

	public static void decrement()
	{
		//synchronized(lock1)
		{
			bankBalance--;
		}
		
	}
	
	
	public void run() {
		System.out.println("This code is running in a thread");
		try {
			for(int i = 0 ; i < 10000 ; i++)
			{
				//System.out.println("child Thread : " + " " + i);
				
				decrement();
				
				Thread.currentThread().sleep(1);
			}
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
	}
}