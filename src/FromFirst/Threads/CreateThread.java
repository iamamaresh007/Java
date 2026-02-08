import java.lang.*;

class MyThread implements Runnable {
    
    public void run() {
        System.out.println("Thread running");
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        
        t.start();
        System.out.println(t.getName());
    }
}
