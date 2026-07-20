import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
       List<List<String>> departments = Arrays.asList(
        Arrays.asList("John", "David"),
        Arrays.asList("Alice", "Bob"),
        Arrays.asList("Steve"));
        
        List<String> output = departments.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(output);
    }
}
