import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        int sum = numbers.parallelStream().reduce(0, Integer::sum);
        System.out.println("Sum of all are ---> " + sum);
    }
}
