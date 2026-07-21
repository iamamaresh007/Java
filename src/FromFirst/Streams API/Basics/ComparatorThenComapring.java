import java.util.*;
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
        
        employees.add(new Employee(20, "Ganesh", 8000, "Entertainment"));
        employees.add(new Employee(1, "Amaresh", 12000, "IT"));
        employees.add(new Employee(7, "Dhoni", 7000, "Sports"));
        employees.add(new Employee(8, "Yash", 8000, "Entertainment"));
        employees.add(new Employee(18, "Virat", 18000, "Sports"));
        employees.add(new Employee(10, "Tom Cruise", 10000, "Entertainment"));
        
        List<Employee> sortByDept = employees.stream().sorted(Comparator.comparing(Employee::getDepartment)).collect(Collectors.toList());
        System.out.println(sortByDept);
        
        
        List<Employee> sortByDeptSalary = employees.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(sortByDeptSalary);

        //The Important Rule ⭐⭐⭐⭐⭐ -> reversed() reverses the entire comparator built so far, not just the last comparison
        //.sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary,Comparator.reverseOrder()))
        //.sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Comparator.comparing(Employee::getSalary).reversed()))
        List<Employee> sortByDeptSalaryDesc = employees.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(sortByDeptSalaryDesc);
        
        List<Employee> sortByDeptSalaryName = employees.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary).thenComparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(sortByDeptSalaryName);
        
    }
}
