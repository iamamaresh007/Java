import java.util.function.*;

class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> random = Math::random;
        System.out.println(random.get());
    }
}
