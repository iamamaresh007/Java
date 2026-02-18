import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
        
       List<String> sort = strings.stream().filter(s -> s.contains("API")).collect(Collectors.toList());
        
        System.out.println("String which contains API is" + sort);
      }
}
