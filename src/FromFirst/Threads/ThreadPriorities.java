
class ThreadPriorities extends Thread {
    
    synchronized public void run() {
        for (int i = 0; i <= 2; i++) {
            System.out.println(i);
            System.out.println("Current Thread name is " + Thread.currentThread().getName());
            System.out.println("Current Thread priroty is " + Thread.currentThread().getPriority());
        }
    }
}
class Main {
    public static void main(String[] args) {
        
        ThreadPriorities tp = new ThreadPriorities();
        
        Thread t1 = new Thread(tp);
        Thread t2 = new Thread(tp);
        Thread t3 = new Thread(tp);
        Thread t4 = new Thread(tp);
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(3);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        System.out.println("Thread t1 priority is -> " + t1.getPriority());
        System.out.println("Thread t2 priority is -> " + t2.getPriority());
        System.out.println("Thread t3 priority is -> " + t3.getPriority());
        System.out.println("Thread t4 priority is -> " + t4.getPriority());

    }
}
