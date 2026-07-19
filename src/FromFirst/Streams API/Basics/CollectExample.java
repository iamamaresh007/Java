import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12);
        List<Integer> result = numbers.stream().filter(num -> num > 5).collect(Collectors.toList());
        System.out.println(result);
    }
}
