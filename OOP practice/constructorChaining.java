
public class constructorChaining {
	constructorChaining()
	{
		this(10); // to call constructor from another constructor this keyword is used
	}
	
	constructorChaining(int x)
	{
		System.out.println("hello " + x);
	}
	
	public static void main(String[] args)
	{
		constructorChaining obj = new constructorChaining();
		
	}
}
