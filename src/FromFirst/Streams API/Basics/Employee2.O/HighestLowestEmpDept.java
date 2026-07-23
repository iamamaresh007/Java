import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    // Constructor
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    
    public String getDepartment() {
        return department;
    }
    
    @Override
public String toString() {
    return "Employee{id =" + id +
           ", name ='" + name + '\'' +
           ", salary = " + salary +
           ", department = " + department +
           '}';
    
}
}

class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
    employees.add(new Employee(1, "Amaresh", 12000, "IT"));
    employees.add(new Employee(2, "Ganesh", 8000, "Entertainment"));
    employees.add(new Employee(3, "Dhoni", 7000, "Sports"));
    employees.add(new Employee(4, "Yash", 8000, "Entertainment"));
    employees.add(new Employee(5, "Virat", 18000, "Sports"));
    employees.add(new Employee(6, "Tom", 10000, "Entertainment"));
    
    String highestEmpDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("");
    System.out.println(highestEmpDept);
    
    String lowestEmpDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet().stream().min(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("");
    System.out.println(lowestEmpDept);
    }
}
