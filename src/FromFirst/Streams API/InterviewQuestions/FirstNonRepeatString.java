import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
       List<String> words = Arrays.asList("apple","banana","apple","orange","banana", "grapes");
       String firstNonRepeat = words.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(w -> w.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse("");
       System.out.println(firstNonRepeat);
    }
}
