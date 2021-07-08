class demo2{
	static class inner
	{
		public int add(int x, int y)
		{
			return x + y;
		}
	}
}
public class staticInnerClassWithNonStaticMethos {
	public static void main(String[] args)
	{
		demo2.inner ob = new demo2.inner();
		System.out.println(ob.add(4, 5));
	}
}
