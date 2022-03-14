package com.infy.batch2022.abhishekmalhotra.thread;

public class MainThreadExampleWithLocking implements Runnable {

	 Integer bankBalance = 0;
	
	 boolean operationInProgress = false;
	 
	
	public static void main(String[] args) {

		
		MainThreadExampleWithLocking mainThreadObj = new MainThreadExampleWithLocking();
		
		
		Thread childThread = new Thread(mainThreadObj);

		childThread.start();

		
		try {
			
			for(int i = 0 ; i < 10000 ; i++)
			{
				//System.out.println("Main Thread : " + " " + i);
				
				Thread.currentThread().sleep(1);
				
				mainThreadObj.increment();
				
			}
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
		System.out.println("Bank Balance" + " " + mainThreadObj.bankBalance );
		
	}
	
	public synchronized void increment() throws Exception
	{
		if(operationInProgress)
		{
		 
			this.wait();
			 
		}
		else
		{
			operationInProgress = true;
			
			bankBalance++;
 	
			operationInProgress = false;
			notifyAll();
		}
	}

	public  synchronized void decrement() throws Exception
	{
		
		if(operationInProgress)
		{
		 
			this.wait();
			 
		}
		else
		{
			operationInProgress = true;
			
			bankBalance--;
 	
			operationInProgress = false;
			notifyAll();
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