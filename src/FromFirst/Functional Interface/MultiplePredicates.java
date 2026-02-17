import java.util.function.*;

class Main {
    public static void main(String[] args) {
       Integer[] arr = {2, 11, 77, 98, 332, 45, 8, 99};
       
       Predicate<Integer> pred = n -> true;
       Predicate<Integer> pred1 = n -> n > 10;
       Predicate<Integer> pred2 = n -> n < 15;
       
       System.out.println("All numbers");
       calculate(pred, arr);
       
       System.out.println("Numbers greater than 10");
       calculate(pred1, arr);
       
       System.out.println("Numbers less than 15");
       calculate(pred2, arr);
    }
    
    static void calculate(Predicate<Integer> p, Integer[] arr) {
        for (Integer i : arr) {
            if(p.test(i)) {
                System.out.println(i);
            }
        }
    }
}
