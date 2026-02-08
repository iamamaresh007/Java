
class MyThread implements Runnable {
    
    public void run() {
        task1();
        task2();
        task3();
    }
    
    void task1() {
        System.out.println("task1 running");
    }
    
    void task2() {
        System.out.println("task2 running");
    }
    
    void task3() {
        System.out.println("task3 running");
    }
}

class Main {
    public static void main(String[] args) {
        
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        
        t.start();
    }
}
