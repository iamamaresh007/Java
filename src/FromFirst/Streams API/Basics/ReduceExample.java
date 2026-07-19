import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        
        int resultV1 = numbers.stream().reduce((a, b) -> a + b).orElse(0);
        //int resultV1 = numbers.stream().reduce(Integer::sum).orElse(0);
        
        int resultV2 = numbers.stream().reduce(0, (a, b) -> a + b);
        //int resultV2 = numbers.stream().reduce(0, Integer::sum);
        
        System.out.println(resultV1);
        System.out.println(resultV2);
    }
}
