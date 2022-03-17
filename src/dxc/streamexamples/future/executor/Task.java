package dxc.streamexamples.future.executor;

 
import java.util.concurrent.TimeUnit;
 
public class Task implements Runnable {
    private String name;
 
    public Task(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void run() {
        try {
            Long duration = (long) (Math.random() * 10);
            System.out.println("Executing : " + name);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}