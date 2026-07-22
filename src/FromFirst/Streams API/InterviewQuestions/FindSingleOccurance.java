import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 5, 4, 7, 9, 3, 1, 3);
        List<Integer> result = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(v -> v.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        
        System.out.println(result);
    }
}
