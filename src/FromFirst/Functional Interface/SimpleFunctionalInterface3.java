
@FunctionalInterface
interface Demo {
    //void square(int x);
    int sum(int y, int z);
}

class Main {
    public static void main(String[] args) {
        
        //Demo demo = (int x) -> System.out.println(x * x);
        //demo.square(25);
        
        Demo demo1 = (int y, int z) -> (y + z);
        int result = demo1.sum(100, 200);
        System.out.println(result);
    }
}
