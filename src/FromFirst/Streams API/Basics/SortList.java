import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, 2, 6, 1, 9, 4);
        List<Integer> ascending = numbers.stream().sorted().collect(Collectors.toList());
        List<Integer> descending = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ascending);
        System.out.println(descending);
    }
}
