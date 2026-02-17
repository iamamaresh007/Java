import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
       
       Map<Boolean, List<Integer>> part = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

       /*🧠 What it does
            numbers.stream() — creates a stream from the list.
            Collectors.partitioningBy(n -> n % 2 == 0) — splits the elements into two groups based on the predicate:

            Key true: elements for which the predicate is true → even numbers.
            Key false: elements for which the predicate is false → odd numbers.

            The result is a Map<Boolean, List<Integer>>:
            partitioned.get(true) → list of evens.
            partitioned.get(false) → list of odds.*/
       
       System.out.println("After partitioning -> " + part); // {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8]}
       
       List<Integer> evenNums = part.get(true);
       List<Integer> oddNums = part.get(false);
       
       System.out.println("Even numbers are ~> " + evenNums);
       System.out.println("Even numbers are ~> " + oddNums);
    }
}
