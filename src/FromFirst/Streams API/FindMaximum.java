import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int maxNumber = numbers.stream().max(Integer::compare).orElse(-1);
        int minNumber = numbers.stream().min(Integer::compare).orElse(-1);
        
        System.out.println("MAX number in the list is " + maxNumber);
        System.out.println("MIN number in the list is " + minNumber);
    }
}
