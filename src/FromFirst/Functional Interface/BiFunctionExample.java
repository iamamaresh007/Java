import java.util.function.*;

class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> fun = (a, b) -> a + b;
        System.out.println(fun.apply(10, 20));
    }
}
