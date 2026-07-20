import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<String> skills = Arrays.asList("Java", "Spring", "Docker");
        String joinOutput = skills.stream().collect(Collectors.joining());
        String joinOutput2 = skills.stream().collect(Collectors.joining(", "));
        String joinOutput3 = skills.stream().collect(Collectors.joining(", ", "[", "]"));
        //Collectors.joining(delimiter, prefix, suffix)
        
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        String joinOutput4 = numbers.stream().map(String::valueOf).collect(Collectors.joining(", "));
        //Because joining() works with String (or more generally, CharSequence) elements.
        
        System.out.println(joinOutput);
        System.out.println(joinOutput2);
        System.out.println(joinOutput3);
        System.out.println(joinOutput4);
    }
}
