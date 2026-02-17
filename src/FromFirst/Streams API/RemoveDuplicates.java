import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        list = list.stream().distinct().collect(Collectors.toList());
        
        System.out.println("Duplicate removed list is " + list);
        
    }
}
