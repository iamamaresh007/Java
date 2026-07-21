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
        
        Map<String, List<String>> employeeNamesByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(employeeNamesByDepartment);
        
    }
}

/*Interview Question ⭐⭐⭐⭐⭐
The interviewer asks: What's the difference between map() and Collectors.mapping()?
Interview-Preferred Answer is:-
1) map()
* Intermediate Stream operation.
* Transforms every element before collecting.

Example:
employees.stream()
         .map(Employee::getName)
         .collect(Collectors.toList());

Result: [Amaresh, Ganesh, Dhoni, Virat...]

2) Collectors.mapping()
* Used inside another collector (usually groupingBy()).
* Transforms elements within each group.

Example:
groupingBy(
    Employee::getDepartment,
    mapping(Employee::getName, toList()))

Result:
{
IT=[Amaresh],
Sports=[Dhoni, Virat]
}

This difference is asked surprisingly often.
*/
