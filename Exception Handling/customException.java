class MyException extends Exception
{
	private int x;
	MyException(int a)
	{
		x = a;
	}
	public String toString()
	{
		return "MyException [" + x + "] is less than zero";
	}
}

public class customException 
{
	static void sum(int a, int b) throws MyException
	{
		if(a < 0)
		{
			throw new MyException(a);
		}
	}
	
	public static void main(String[] args)
	{
		try
		{
			sum(-10, 10);
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}
