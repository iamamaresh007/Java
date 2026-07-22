import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(10, 5, 20, 8, 20, 15, 3);
       Integer secondHighest = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
       Integer thirdHighest = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(-1);
       List<Integer> top3 = numbers.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
       System.out.println(secondHighest);
       System.out.println(thirdHighest);
       System.out.println(top3);
    }
}
