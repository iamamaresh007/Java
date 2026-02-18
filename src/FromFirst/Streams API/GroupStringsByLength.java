import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Stream", "API", "Code", "Fun");
        
        Map<Integer, List<String>> result = names.stream().collect(Collectors.groupingBy(String::length));
        
        System.out.println("String with length are " + result);
      }
}
