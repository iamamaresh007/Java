import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 2, 6, 8, 6, 10);
        Set<Integer> duplicateSet = numbers.stream().collect(Collectors.toSet());
        //List<Integer> result = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(duplicateSet);
    }
}
