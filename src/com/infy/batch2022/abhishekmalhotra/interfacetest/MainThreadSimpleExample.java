package com.infy.batch2022.abhishekmalhotra.interfacetest;

public class MainThreadSimpleExample implements Runnable {

	 
	public static void main(String[] args) {

		
		MainThreadSimpleExample mainThreadObj = new MainThreadSimpleExample();
		
		
		Thread childThread = new Thread(mainThreadObj);

		childThread.start();

		
		try {
			
			for(int i = 0 ; i < 10 ; i++)
			{
				System.out.println("Main Thread : " + " " + i);
				
				Thread.currentThread().sleep(1000);
				
			 
			}
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
	 
		
	}
	
	 
	
	
	public void run() {
		System.out.println("This code is running in a thread");
		try {
			for(int i = 0 ; i < 10 ; i++)
			{
				System.out.println("child Thread : " + " " + i);
				
	 			Thread.currentThread().sleep(1000);
			}
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
	}
}