// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.concurrent.*;

class Tasks implements Runnable {
    private int taskno;
    
    Tasks(int taskno) {
        this.taskno = taskno;
    }
    
    public void run() {
        for (int i = 0; i <= 100; i+=25) {
            String name = Thread.currentThread().getName();
            System.out.println(name + "completed task " + taskno + " by " + i + "%");
            try {
                Thread.sleep(1000);
           } catch(InterruptedException e) {}
        }
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(2);
        
        Tasks t[] = new Tasks[4];
        
        for(int i = 0; i < 4; i++) {
            t[i] = new Tasks(i);
            es.execute(t[i]); // Execute the task by array reference.
        }
        es.shutdown();
    }
}
