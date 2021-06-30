public class stringBuilder 
{
	public static void main(String[] args)
	{
		//not thread safe
		//not synchronized
		StringBuilder s = new StringBuilder("Hello, World!");
		System.out.println(s.append(" Namaste"));
		System.out.println(s.reverse());
	}
}
