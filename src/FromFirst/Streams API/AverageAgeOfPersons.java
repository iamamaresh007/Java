import java.util.Arrays;
import java.util.List;

class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) {
       List<Person> persons = Arrays.asList(new Person("Amaresh", 28), new Person("Dhoni", 46), new Person("Yash", 40));
       
       Double avg = persons.stream().mapToInt(Person::getAge).average().orElse(0);
       // In Java Streams, average() is available on primitive streams like IntStream, not on Stream<Integer>. So you should use mapToInt(Person::getAge)

       System.out.println("Average age is " + avg);
    }
}
