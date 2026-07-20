import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
       List<String> names = Arrays.asList("Amaresh", "Patil", "Dhoni");
       List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
       System.out.println(upperCaseNames);
    }
}

/*  Lambda	                     Method Reference
x -> x.toUpperCase()	           String::toUpperCase
x -> x.toLowerCase()	           String::toLowerCase
x -> x.length()	                 String::length
x -> String.valueOf(x)	         String::valueOf
list -> list.stream()	           List::stream
x -> System.out.println(x)	     System.out::println
() -> new ArrayList<>()	         ArrayList::new*/
