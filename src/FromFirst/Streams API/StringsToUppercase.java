import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "stream", "api");
        List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        
        System.out.println("Names after converting to uppercase " + upperNames);
      
    }
}
