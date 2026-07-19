import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,5,4,7,9,3,1,3);
        List<Integer> result = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(result);
    }
}
