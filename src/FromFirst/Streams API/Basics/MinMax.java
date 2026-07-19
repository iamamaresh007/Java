import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 8, 25, 3, 18, 10);
        int minNumber = numbers.stream().min(Comparator.naturalOrder()).orElse(-1);
        //numbers.stream().sorted().findFirst();
        int maxNumber = numbers.stream().max(Comparator.naturalOrder()).orElse(-1);
        //numbers.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println(minNumber);
        System.out.println(maxNumber);
    }
}
