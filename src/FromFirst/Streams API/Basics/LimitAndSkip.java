import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
        List<Integer> firstThree = numbers.stream().limit(3).collect(Collectors.toList());
        List<Integer> lastThree = numbers.stream().skip(4).collect(Collectors.toList());
        System.out.println(firstThree);
        System.out.println(lastThree);
    }
}
