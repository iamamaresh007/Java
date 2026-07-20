import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","Banana", "Mango", "Avocado", "Blueberry");
        Map<Character, List<String>> result = fruits.stream().collect(Collectors.groupingBy(fruit -> fruit.charAt(0)));
        System.out.println(result);
    }
}
