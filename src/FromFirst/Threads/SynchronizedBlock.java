
class Reserve implements Runnable {
    
    int available = 1;
    int wanted;
    
    Reserve(int i) {
        wanted = i;
    }
    
    public void run() {
        synchronized(this) {
            String name = Thread.currentThread().getName();
            if(available >= wanted) {
            System.out.println(wanted + " berths reserved for " + name);
            available = available - wanted;
        } else {
            System.out.println("Sorry no berths for " + name);
        }
        }
    }
}

class Main {
    public static void main(String[] args) {
        
        Reserve obj = new Reserve(1);
        
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        
        t1.setName("Person 1");
        t2.setName("Person 2");
        
        t1.start();
        t2.start();
    }
}
