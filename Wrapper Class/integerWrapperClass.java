public class integerWrapperClass 
{
	public static void main(String[] args)
	{
		Integer a = 30;
		boolean ok = a instanceof Integer;
		System.out.println(ok);
		String s = Integer.toString(50);
		System.out.println(s);
		ok = s instanceof String;
		System.out.println(ok);
		
		int x = 95;
		System.out.println(Integer.valueOf(x));
		
		String ss = "100";
		
		Integer i = Integer.parseInt(ss);
		System.out.println(i);
	}
}
