import java.util.function.Consumer; 

class ConsumerExample {

    public static void main(String[] args) {

        Consumer<Integer> consumer = n -> System.out.println("Number: " + n);

        Consumer<Integer> doubleValue = d -> System.out.println("Double: " + (d * 2));

          consumer.andThen(doubleValue).accept(5);
    }
}
