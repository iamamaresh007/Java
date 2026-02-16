import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

class PredicateExample {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Bengaluru");
        cities.add("Mysuru");
        cities.add("Ilkal");
        cities.add("Udupi");
        
        Predicate<String> filterCity = city -> city.equals("Ilkal");
        cities.stream().filter(filterCity).forEach(System.out::println);
    }
}
