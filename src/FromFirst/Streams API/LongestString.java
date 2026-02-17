import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> fruites = Arrays.asList("Apple", "Banana", "Chikku", "Grappes", "Mango", "Pineapples");
        
        Optional<String> maxLength = fruites.stream().max(Comparator.comparingInt(String::length));
        
        Optional<String> minLength = fruites.stream().min(Comparator.comparingInt(String::length));
        
        System.out.println("Longest string is " + maxLength.get());
        //System.out.println(ff.orElse("Jack Fruit"));
        
        System.out.println("Shortest string is " + minLength.get());
    }
}
