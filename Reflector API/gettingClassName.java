class Employee
{
	
}
public class gettingClassName 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		// in instance is not available
		Class n = Employee.class;
		System.out.println(n);
		
		n = String.class;
		System.out.println(n);
		
		// if instance is available
		Employee e = new Employee();
		Class name = e.getClass();
		System.out.println(name);
		
		name = "Hello".getClass();
		System.out.println(name);
		
		//if class have fully qualified name
		Class m = Class.forName("Employee");
		System.out.println(m);
		
		m = Class.forName("java.lang.String");
		System.out.println(m);
	}
}
