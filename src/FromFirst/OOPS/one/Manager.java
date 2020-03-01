package FromFirst.OOPS.one;

public class Manager {
	public static void main(String[] args) {
		
		Employee emp_1 = new Employee(110, "Amaresh", 45000);
		Employee emp_2 = new Employee(102, "Rahul", 40000);
		Employee emp_3 = new Employee(107, "Dhoni");
		
		Employee[] emp = {emp_1,emp_2,emp_3};
		float total_sal_before_incre=0;
		
		for(Employee e:emp)
		{
			total_sal_before_incre+=e.getSalary();
			e.showInfo();
		}
		System.out.println("Total salary before increment:"+total_sal_before_incre);
		System.out.println("_________________________________________");
		//Total Salary after incrementing
		float total_sal_after_incre=0;
		
		for(Employee e:emp)
		{
			e.Increment(10);
			total_sal_after_incre+=e.getSalary();
			e.showInfo();
		}
		System.out.println("Total salary after increment:"+total_sal_after_incre);
		
	}

}
