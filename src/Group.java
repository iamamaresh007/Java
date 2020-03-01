import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee
{
 int id;
String name;
Employee(int i,String n)
{
id=i;
name=n;
}
void display()
{
System.out.println(id+"\t"+name);
}
} 
class Group
{
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Employee arr[]=new Employee[5];

for(int i=0;i<5 ;i++)
{
System.out.println("Enter id:");
int id = Integer.parseInt(br.readLine());

System.out.println("Enter name:");
String name = br.readLine();

arr[i]= new Employee(id,name);
}
 System.out.println("Employee data is\n");
for(int i=0;i<arr.length;i++)
{
arr[i].display();
}
}
}