/*
Interview Knowledge ⭐⭐⭐⭐⭐
There are three similar collectors:

Collector	      Used For	Return Type
summingInt()	  int values	Integer
summingLong()	  long values	Long
summingDouble()	double values	Double

*/

/*
⭐ Interview Memory Trick
Whenever you see these methods:
sorted()
maxBy()
minBy()

Ask yourself: "Java needs to compare two objects. How will it know which one is bigger?"
The answer is: Give it a Comparator.
*/
// --------------------------------------------------------------------------------------------------


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
        
        employees.add(new Employee(20, "Ganesh", 8000, "Entertainment"));
        employees.add(new Employee(1, "Amaresh", 12000, "IT"));
        employees.add(new Employee(7, "Dhoni", 7000, "Sports"));
        employees.add(new Employee(8, "Yash", 8000, "Entertainment"));
        employees.add(new Employee(18, "Virat", 18000, "Sports"));
        employees.add(new Employee(10, "Tom Cruise", 10000, "Entertainment"));
        
        Map<String, Long> countByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(countByDept);
        
        Map<String, Double> sumSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        System.out.println(sumSalaryByDept);
        
        Map<String, Double> avgByDeptSalary = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgByDeptSalary);
        
        Map<String, Optional<Employee>> highestSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(highestSalaryByDept);
        
        Map<String, Optional<Employee>> lowestSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(lowestSalaryByDept);
        
    }
}
