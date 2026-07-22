import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 5, 4, 7, 9, 3, 1, 3);
        Map<Integer, Long> frequency = numbers.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Integer firstOccurance = frequency.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).findFirst().orElse(-1);
        
        System.out.println(frequency);
        System.out.println(firstOccurance);
        
    }
}
