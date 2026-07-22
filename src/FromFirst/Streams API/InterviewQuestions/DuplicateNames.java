import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
       List<String> names = Arrays.asList("John","David","Alice","John","Bob","Alice","Steve");
       List<String> result = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(name -> name.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
       System.out.println(result);
    }
}
