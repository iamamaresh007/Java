import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        Set<Integer> unique = new HashSet<>();
        
        Set<Integer> duplicates = numbers.stream().filter(u -> !unique.add(u)).collect(Collectors.toSet());
        
        System.out.println("Duplicates are " + duplicates);
      }
}
