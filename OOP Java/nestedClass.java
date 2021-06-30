class outer
{
	int cnt;
	class inner
	{
		public void display()
		{
			System.out.println("Inside inner class: " + cnt);
		}
	}
}
public class nestedClass {
	public static void main(String[] args)
	{
		outer out = new outer();
		outer.inner in = out.new inner();
		in.display();
	}
}
