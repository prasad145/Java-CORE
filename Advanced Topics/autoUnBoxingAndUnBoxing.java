import java.util.ArrayList;

public class autoUnBoxingAndUnBoxing 
{
	public static int add(Integer a, Integer b)
	{
		return a + b;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10); // auto unboxing passing int (primitive type) and it is converted into Integer object type
		a.add(20); // JVM  implicitly converts int to integer know auto unboxing
		
		int element = a.get(0); // here Integer(object) to int(primitive) conversion implicitly by JVM , known as unboxing 
		System.out.println(element);
		
		int sum = add(10, 20); //passing int as a arguments, but method parameters are Interger object of Wrapper class here JVM does the type conversion(Auto Unboxing) for us. 
		System.out.println(sum);
	}
}
