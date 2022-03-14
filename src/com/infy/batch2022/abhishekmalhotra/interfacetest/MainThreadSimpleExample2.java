package com.infy.batch2022.abhishekmalhotra.interfacetest;

public class MainThreadSimpleExample2 implements Runnable {

	 
	public static void main(String[] args) {

		Thread.currentThread().setName("MainThread");
		
		MainThreadSimpleExample2 mainThreadObj = new MainThreadSimpleExample2();
		
		
		Thread childThread1 = new Thread(mainThreadObj);
		childThread1.setName("childThread1");
		//childThread1.start();


		Thread childThread2 = new Thread(mainThreadObj);
		childThread2.setName("childThread2");
		//childThread2.start();

		mainThreadObj.run();
		
		
		try {
			
			for(int i = 0 ; i < 10 ; i++)
			{
				//System.out.println("Main Thread : " + " " + i);
				System.out.println(Thread.currentThread().getName());
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
				System.out.println("child Thread : " + 
						Thread.currentThread().getName() + "  " + i);
 	 			Thread.currentThread().sleep(1000);
			}
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
	}
	 
}