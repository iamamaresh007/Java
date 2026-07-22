import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
       String input = "programming";
       Character firstNonRepeatChar = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(c -> c.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
       
       System.out.println(firstNonRepeatChar);
    }
}

/*⭐ Interview Question:- Why did you use mapToObj(c -> (char) c)?

 * Your answer should be: "chars() returns an IntStream containing Unicode values. 
                           Since I want to work with characters and use groupingBy(Function.identity()), 
                           I convert each integer into a Character using mapToObj(c -> (char) c)."*/
