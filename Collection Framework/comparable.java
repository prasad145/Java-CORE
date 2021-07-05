import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return this.id + " " + this.name;
	}
	
	public int compareTo(Employee e)
	{
		return this.id - e.id;
	}
}

public class comparable {
	public static void main(String[] args)
	{
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(2, "Prasad"));
		emp.add(new Employee(1, "Vamshi"));
		
		for(int i = 0; i < emp.size(); i++)
		{
			System.out.println(emp.get(i) + " ");
		}
		System.out.println();
		Collections.sort(emp);
		System.out.println("After sorting on ID:");
		for(int i = 0; i < emp.size(); i++)
		{
			System.out.println(emp.get(i) + " ");
		}
	}
}
