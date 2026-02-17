import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 13, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 16, 8, 10);
        List<Integer> sortedList = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
        
        List<Integer> reverseSortedList = Stream.concat(list1.stream(), list2.stream()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        System.out.println("Sorted final list is " + sortedList);
        System.out.println("Reverse sorted final list is " + reverseSortedList);
        }
}
