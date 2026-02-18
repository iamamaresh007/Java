import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
       List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        
       List<String> filterList = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
       
       Long cnt = names.stream().filter(name -> name.startsWith("A")).count();
       
       System.out.println("Names starts with A are " + filterList);
       System.out.println("Total number of names starts with A are " + cnt);

    }
}
