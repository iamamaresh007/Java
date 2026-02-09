
class DaemonExample extends Thread {
    public void run() {
        System.out.println("I am reservation thread");
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        DaemonExample de = new DaemonExample();
      
        Thread t = new Thread(de);
        t.setDaemon(true);
        boolean res = t.isDaemon();
        
        System.out.println(res);
    }
}
