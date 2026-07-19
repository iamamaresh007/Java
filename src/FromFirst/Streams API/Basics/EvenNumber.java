import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 8, 9, 12, 15, 18);
        List<Integer> result = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(result);
    }
}
