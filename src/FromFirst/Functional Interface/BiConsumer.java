import java.util.function.*;

class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> con = (name, age) -> System.out.println(name + " " + age);
        con.accept("Amaresh", 28);
    }
}
