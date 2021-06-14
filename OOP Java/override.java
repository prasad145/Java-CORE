class demo {
	private int a, b;
	public demo(int n ,int m)
	{
		this.a = n;
		this.b = m;
	}
	
	//in order to print object reference we need to override the Object class toString() method otherwise hascode will be printed on the console
	@Override
	public String toString()
	{
		return a + " != " + b;
	}
}

public class override{
	public static void main(String[] args)
	{
		demo obj = new demo(1, 2);
		System.out.println(obj);
	}
}
