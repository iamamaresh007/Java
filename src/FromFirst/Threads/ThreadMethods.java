
class Main {
    public static void main(String[] args) {
        Thread t = new Thread(); // Create thread without any name
        Thread t2 = new Thread(obj); // obj is target object of thread
        Thread t3 = new Thread(obj, "thread-name"); // target object & thread name
        
        Thread t = Thread.currentThread();
        
        t.start();
        
        Thread.sleep(1000); // 1000 milliseconds = 1 Second
        
        String name = t.getName();
        
        t.setName("new name");
        
        int priority = t.getPriority();
        
        t.setPriority(5);
        
        t.isAlive();
        
        t.join(); // To wait till thread dies.
    }
}
