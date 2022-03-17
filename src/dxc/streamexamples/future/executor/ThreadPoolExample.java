package dxc.streamexamples.future.executor;

 
 
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
 
import java.util.*;



public class ThreadPoolExample 
{
    public static void main(String[] args) 
    {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
         
        for (int i = 1; i <= 5; i++) 
        {
            Task task = new Task("Task " + i);
            System.out.println("Created : " + task.getName());
 
            executor.execute(task);
        }
        executor.shutdown();
        
        
        ///---
        
        /*
        ExecutorService executorService = 
        		  new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,   
        		  new LinkedBlockingQueue<Runnable>());
        
        
        Runnable runnableTask = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Callable<String> callableTask = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "Task's execution";
        };
        
        

        
        List<Callable<String>> callableTasks = new ArrayList<>();
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);
        
        
        
        executorService.execute(runnableTask);
        */
        
        /*
        Future<String> future = 
        		  executorService.submit(callableTask);
        
        */
        
    }
}