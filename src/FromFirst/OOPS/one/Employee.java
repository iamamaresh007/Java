package FromFirst.OOPS.one;

public class Employee {
	private int empno;
	private String name;
	private float salary;
	
	Employee(int empno,String name,float salary)
	{
		this.empno=empno;
		this.name=name;
		this.salary=salary;
	}
	Employee(int empno,String name)
	{
		this.empno=empno;
		this.name=name;
		this.salary=30000;
	}
	public void showInfo()
	{
		System.out.println(String.format("%d,%s,%f",empno,name,salary));
	}
	public void Increment(int percentage)
	{
		this.salary+=(this.salary*percentage)/100;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

}
