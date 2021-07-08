class demo4{
	class inner{
// illegal because static method can be there only when top level is static
//		static void add(int x, int y)
//		{
//			System.out.println(x + y);
//		}
		
		public static final int a = 50;
	}
}
public class nonStaticInnerClassWithStaticMethos {
	public static void main(String[] args)
	{
		demo4 ob = new demo4();
		demo4.inner in = ob.new inner();
		System.out.println(in.a);
	}
}
