import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> output = numbers.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(output);
    }
}
