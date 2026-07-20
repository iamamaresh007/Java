import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 8, 11, 14, 17);
        Map<Boolean, List<Integer>> output = numbers.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(output);
    }
}
