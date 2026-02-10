
@FunctionalInterface  //You can (optionally) mark them with @FunctionalInterface to get compile-time checking.
interface Demo {
    void greet(String name); // only abstract method.
}

class Main {
    public static void main(String[] args) {
        // Using a lambda
        Demo d = (name) -> System.out.println("Hi " + name);
        d.greet("Amaresh");
        
        // Using a method reference
        Demo dd = System.out::println;
        dd.greet("Hero");
    }
}
