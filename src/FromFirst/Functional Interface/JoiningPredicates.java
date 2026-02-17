import java.util.function.*;

class Main {
    public static void main(String[] args) {
       Integer[] arr = {8, 9, 10, 11, 12, 13, 14, 15};
       
       Predicate<Integer> pred1, pred2;
       pred1 = n -> n > 10;
       pred2 = n -> n < 15;
       
       System.out.println("Numbers > 10 and < 15 are --->");
       calculate(pred1.and(pred2), arr);
       System.out.println("Numbers < 10 and > 15 are ~~~>");
       calculate(pred1.and(pred2).negate(), arr);
    }
    
    static void calculate(Predicate<Integer> p, Integer[] arr) {
        for (Integer i : arr) {
            if(p.test(i)) {
                System.out.println(i);
            }
        }
    }
}
