class Reservation extends Thread {
    public void run() {
        System.out.println("I am reservation thread");
    }
}
class Cancellation extends Thread {
    public void run() {
        System.out.println("I am Cancellation thread");
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Reservation res = new Reservation();
        Cancellation can = new Cancellation();
        
        ThreadGroup tg = new ThreadGroup("First Thread Group");
        Thread t1 = new Thread(tg, res, "First Thread");
        Thread t2 = new Thread(tg, res, "Second Thread");
        
        ThreadGroup tg2 = new ThreadGroup(tg, "Second Thread Group");
        Thread t3 = new Thread(tg2, can, "Third Thread");
        Thread t4 = new Thread(tg2, can, "Fourth Thread");
        
        System.out.println("Parent of tg is --> " + tg.getParent());
        System.out.println("Parent of tg2 is --> " + tg2.getParent());
        
        tg2.setMaxPriority(7);
        
        System.out.println("Thread group of t1 is --> " + t1.getThreadGroup());
        System.out.println("Thread group of t3 is --> " + t3.getThreadGroup());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        System.out.println("No of threads active in tg -----> " + tg.activeCount());
        System.out.println("No of threads active in tg2 -----> " + tg2.activeCount());
    }
}
