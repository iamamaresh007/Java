import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 11, 18, 25, 31);
        boolean result = numbers.stream().anyMatch(num -> num % 2 == 0);
        System.out.println(result);
    }
}
/*
anyMatch()	At least one matches
allMatch()	Every element matches
noneMatch()	No element matches
*/
