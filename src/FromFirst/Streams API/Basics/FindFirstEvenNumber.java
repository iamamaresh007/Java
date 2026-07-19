import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 15, 8, 20, 25, 30);
        Integer firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst().orElse(-1);
        // Integer firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst().orElseThrow();
        // numbers.stream().filter(n -> n % 2 == 0).findFirst().ifPresent(System.out::println);
        System.out.println(firstEven);
    }
}
