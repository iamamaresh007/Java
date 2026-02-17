import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        
        Map<String, Long> map = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      
        /*groupingBy(...): Groups elements by a classifier. Here, the classifier is Function.identity() (i.e., each element is grouped by itself—the word).
         Function.identity(): Returns the input as-is. So each "apple" is grouped under the "apple" key, "banana" under "banana", etc.
         Collectors.counting(): For each group (each distinct word), counts how many elements landed in that group. Returns a Long.*/
        
        map.forEach((key, value) -> System.out.println(key + ": " + value));
        
    }
}
