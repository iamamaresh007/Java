import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "is", "powerful", "Development");
        
        String result = words.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).orElse(null);
        
        System.out.println("Longest string is ---> " + result);
       
    }
}
