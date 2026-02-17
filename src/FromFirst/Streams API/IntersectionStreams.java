import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        
        Set<Integer> set2 = new HashSet<>(list2); //Rule of thumb: Build a set/map from the smaller collection to minimize memory and construction cost.

        List<Integer> interSection = list1.stream().filter(set2::contains).distinct().collect(Collectors.toList());
        
        System.out.println("Final intersection list is " + interSection);
        
    }
}
