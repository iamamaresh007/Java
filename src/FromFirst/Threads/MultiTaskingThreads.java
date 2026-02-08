
class MyThread implements Runnable {
    
    String str;
    MyThread(String str) {
        this.str = str;
    }
    
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(str + ":" + i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        
        MyThread obj1 = new MyThread("Show the ticket");
        MyThread obj2 = new MyThread("Cancel the ticket");

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
