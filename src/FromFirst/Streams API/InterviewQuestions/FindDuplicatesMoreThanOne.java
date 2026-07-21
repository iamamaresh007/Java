import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,9,8,3,1,6,7,4,6);
        List<Integer> result = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1).map(k -> k.getKey()).collect(Collectors.toList());
        System.out.println(result);
    }
}
