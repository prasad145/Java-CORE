class demo1
{
	static class inner
	{
		public static int add(int x, int y)
		{
			return x + y;
		}
	}
}
public class staticInnerClass 
{
	public static void main(String[] args)
	{
		System.out.println(demo1.inner.add(4, 5));
	}
}
