import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango");
        Map<String, Integer> result = fruits.stream().collect(Collectors.toMap(Function.identity(), String::length));
        //In Java Streams, Function.identity() is a static utility method that returns a function that always returns its exact input argument.
        //static <T> Function<T, T> identity() { return t -> t; }
        System.out.println(result);

        List<String> names = Arrays.asList("John", "Jack", "David","James");
        Map<Character, String> result = names.stream().collect(Collectors.toMap(name -> name.charAt(0), Function.identity(), (existing, replacement) -> replacement));
        System.out.println(result);
        //Output : {D=David, J=James}
        //Notice: John, Jack, and James all produce the same key (J).David produces D.
    }
}
