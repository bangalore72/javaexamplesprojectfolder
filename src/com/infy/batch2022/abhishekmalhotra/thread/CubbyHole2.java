package com.infy.batch2022.abhishekmalhotra.thread;



public class CubbyHole2 {
    private int contents;
    private boolean available = false;
    
    
    public synchronized int get() {    //won't work!
    	if (available == true) 
    	{
    		available = false;
    		return contents;
    	}
    	
    	available = false;
    	//notify Producer that value has been retrieved
    	notifyAll();
    	return contents;
    }
   
    public synchronized void put(int value) {    //won't work!
    	while (available == true) {
    		try {
    			//wait for Consumer to get value
    			wait();
    		} catch (InterruptedException e) { }
    	}
    	contents = value;
    	available = true;
    	//notify Consumer that value has been set
    	notifyAll();
    }
    
}

