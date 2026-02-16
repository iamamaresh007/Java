import java.util.function.*;

class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<String, String> result = (s1, s2) -> s1.equals(s2);
        System.out.println(result.test("Amaresh", "Amaresh"));
    }
}
