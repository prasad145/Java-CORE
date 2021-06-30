public class stringMethods 
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		String s2 = "world";
		String s4 = "HELLO";
		String s3 = new String("hello");
		System.out.println(s1.concat(" " + s2)); //concat function
		System.out.println(s1 + " " + s2); // concat using + opertor
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3); // they belong to different instance because the s3 created using new operator so the instance won't be present in string constant pool
		 							  // of heap, only the s1 and s2 which is created using String will be present in the special memory area of heap called 'string constant pool' so == return false 
		System.out.println(s1.compareTo(s2)); // returns integer
		
		System.out.println(s1.charAt(2));
		
		System.out.println(s1.equalsIgnoreCase(s4));
		
		String s = "study Tonight";
		System.out.println(s.indexOf('t', 2));
		System.out.println(s.indexOf("study"));
		
		System.out.println(s.length());
		
		System.out.println(s.replace('T','t'));
		System.out.println(s.indexOf('t', 2));
		
		System.out.println(s.substring(0, 6));
		System.out.println(s.toUpperCase());
		
		int num = 100;
		String ss = String.valueOf(num);
		System.out.println(ss.getClass().getName());
		
		stringMethods SM = new stringMethods();
		System.out.println(SM);
		
		String t = "  hello world, newbie here!  ";
		System.out.println(t.trim());
		
		System.out.println(t.contains("newbie "));
		
		System.out.println(t.endsWith("!  "));
		System.out.println(t.startsWith("  he"));
		String out = "Date : ";
		System.out.println(out + String.join("/", "30", "06", "2021"));
	}
	
	public String toString()
	{
		return "for class stringMethod object SM created!";
	}
}
