import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 5, 4, 7, 9, 3, 1, 3);
        Map<Integer, Long> frequency = numbers.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Integer firstNonRepeating = frequency.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(-1);
        
        System.out.println(frequency);
        System.out.println(firstNonRepeating);
        
    }
}

/* Then how do we preserve the order -> Use a LinkedHashMap.

    Map<Integer, Long> frequency = numbers.stream()
        .collect(Collectors.groupingBy(
         Function.identity(),
        LinkedHashMap::new,
        Collectors.counting()
    ));
*/

/*Interview Question for You.

  Why didn't you use HashMap?

  A strong answer is:

 "Because I need the first non-repeating element, the original insertion order must be preserved. Since HashMap doesn't guarantee iteration order, I used LinkedHashMap."
*/
