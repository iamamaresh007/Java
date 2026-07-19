import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 8, 9, 12, 15, 18);
        long countEven = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println(countEven);
    }
}
