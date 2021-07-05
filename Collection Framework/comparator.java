import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class student 
{
	int id;
	String name;
	student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return this.id + " " + this.name;
	}
}

class MyComparator implements Comparator<student>
{
	public int compare(student e1, student e2)
	{
		if(e1.id == e2.id)
			return 0;
		else if(e1.id > e2.id)
			return 1;
		else
			return -1;
	}
}

public class comparator {
	public static void main(String[] args)
	{
		ArrayList<student> emp = new ArrayList<student>();
		emp.add(new student(2, "Prasad"));
		emp.add(new student(1, "Vamshi"));
		
		Collections.sort(emp, new MyComparator());
		
		TreeSet<student> emp1 = new TreeSet<student>(new MyComparator());
		emp1.add(new student(2, "Prasad"));
		emp1.add(new student(1, "Vamshi"));

		System.out.println(emp);
	}
}
