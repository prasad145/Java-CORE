class demo3{
	class inner{
		void add(int x, int y)
		{
			System.out.println(x + y);
		}
	}
}
public class nonStaticInnerClassWithNonStaticMethod {
	public static void main(String[] args)
	{
		demo3 ob =  new demo3();
		demo3.inner in = ob.new inner();
		in.add(4, 5);
	}
}
