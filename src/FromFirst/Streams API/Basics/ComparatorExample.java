import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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
    
    @Override
   public String toString() {
    return "Employee{id=" + id +
           ", name='" + name + '\'' +
           ", salary=" + salary +
           '}';
   }
}

class Main {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(1, "Amaresh", 12000));
        emp.add(new Employee(7, "Dhoni", 7000));
        emp.add(new Employee(8, "Yash", 8000));
        emp.add(new Employee(10, "Tom Cruise", 10000));
        
        List<Employee> salaryAsc = emp.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(salaryAsc);
        
        List<Employee> salaryDesc = emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(salaryDesc);
    }
}
