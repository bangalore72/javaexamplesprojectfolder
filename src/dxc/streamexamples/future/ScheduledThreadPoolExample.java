package dxc.streamexamples.future;

 
import java.util.*;
import java.util.concurrent.*;
import java.io.*;

class ScheduledThreadPoolExample {
	public static void main(String[] args)
	{

		// Creating a ScheduledThreadPoolExecutor object
		ScheduledThreadPoolExecutor threadPool
			= new ScheduledThreadPoolExecutor(2);

		// Creating two Runnable objects
		Runnable task1 = new Command("task1");
		Runnable task2 = new Command("task2");

		// Printing the current time in seconds
		System.out.println(
			"Current time : "
			+ Calendar.getInstance().get(Calendar.SECOND));

		// Scheduling the first task which will execute
		// after 2 seconds
		threadPool.schedule(task1, 2, TimeUnit.SECONDS);

		// Scheduling the second task which will execute
		// after 5 seconds
		threadPool.schedule(task2, 5, TimeUnit.SECONDS);

		// Remember to shut sown the Thread Pool
		threadPool.shutdown();
	}
}

//Class that implements the Runnable interface
class Command implements Runnable {
	String taskName;
	public Command(String taskName)
	{
		this.taskName = taskName;
	}
	public void run()
	{
		System.out.println(
			"Task name : " + this.taskName + " Current time: "
			+ Calendar.getInstance().get(Calendar.SECOND));
	}
}
