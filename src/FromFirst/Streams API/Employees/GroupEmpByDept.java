import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id; 
    private String name;
    private String dept;
    private double salary;
    private int age;
    
    Employee(int id, String name, String dept, double salary, int age) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
    }
    public int getId() {
    return id;
    }

    public String getName() {
    return name;
    }

    public String getDept() {
    return dept;
    }

    public double getSalary() {
    return salary;
    }

    public int getAge() {
    return age;
    }
    
    
 @Override
    public String toString() {
        return String.format(
            "Employee{id=%d, name='%s', dept='%s', salary=%.2f, age=%d}",
            id, name, dept, salary, age
        );
    }
}

class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee(1, "Amaresh", "IT", 60000, 28), 
            new Employee(2, "Dhoni", "Sports", 70000, 46), 
            new Employee(3, "Yash", "Entertainment", 30000, 40), 
            new Employee(4, "Ganesh", "Entertainment", 40000, 32), 
            new Employee(5, "Karna", "IT", 100000, 26));
            
            Map<String, List<Employee>> result = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
            System.out.println("Group by department are " + result);
    }
}
