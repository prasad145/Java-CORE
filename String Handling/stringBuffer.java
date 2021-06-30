public class stringBuffer 
{
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("Hello World");
		System.out.println(s.append(", Namaste"));
		System.out.println(s.insert(6, "my"));
		System.out.println(s.replace(6, 13, "Java"));
		
		StringBuffer ss = new StringBuffer();
		System.out.println(ss.capacity());
	}
}
