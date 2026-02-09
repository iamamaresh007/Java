
class Producer extends Thread {
    StringBuffer sb;
    
    Producer() {
        sb = new StringBuffer();
    }
    
    public void run() {
        synchronized(sb) {
            for(int i = 0; i <= 10; i++) {
            System.out.println("Appending");
            sb.append(i + ":");
        }
        sb.notify();
        }
        System.out.println("sb in producer thread -> " + sb);
    }
}

class Consumer extends Thread {
    Producer p;
    
    Consumer(Producer p) {
        this.p = p;
    }
    public void run() {
        synchronized(p.sb) {
            try {
                p.sb.wait();
            } catch(Exception e) {}
            System.out.println("sb in consumer thread -> " + p.sb);
        }
    }
}


class Main {
    public static void main(String[] args) throws Exception {
        Producer obj1 = new Producer();
        Consumer obj2 = new Consumer(obj1);
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t2.start();
        t1.start();
        

    }
}
