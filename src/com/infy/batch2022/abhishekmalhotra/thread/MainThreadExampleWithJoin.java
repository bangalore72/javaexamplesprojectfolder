package com.infy.batch2022.abhishekmalhotra.thread;

public class MainThreadExampleWithJoin implements Runnable {


	static int bankBalance = 0;
	 
	public static void main(String[] args) {

		
		MainThreadExampleWithJoin mainThreadObj = new MainThreadExampleWithJoin();
		
		
		Thread childThread = new Thread(mainThreadObj);

		childThread.start();

		
		try {
			
			for(int i = 0 ; i < 20 ; i++)
			{
				System.out.println("Main Thread : " + " " + i);
				
				Thread.currentThread().sleep(1);
				
				increment();
				
			}
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
		try {
			
			System.out.println("mainthread waiting for child thread  now"  );
			childThread.join();
			
			System.out.println("mainthread almost ending now"  );
			
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
		
		System.out.println("Bank Balance" + " " + bankBalance );
		
	}
	
	public static void increment()
	{
		 
		 
			bankBalance++;
	 
		
	}

	public static void decrement()
	{
	 
		 
			bankBalance--;
		 
		
	}
	
	
	public void run() {
		System.out.println("This code is running in a thread");
		try
		{
			for(int i = 0 ; i < 20 ; i++)
			{
				System.out.println("child Thread : " + " " + i);
				
			 
				
				decrement();
				
				Thread.currentThread().sleep(2);
			}
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
	}
}