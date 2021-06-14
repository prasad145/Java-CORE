class parent{
	
}

public class downCasting extends parent{
	public void check() 
	{
		System.out.println("Successfull Casting");
	}
	
	public static void show(parent p)
	{
		if(p instanceof downCasting)
		{
			downCasting child = (downCasting) p; //downcasting
			child.check();
		}
	}
	
	public static void main(String[] args)
	{
		parent p = new downCasting(); // upcasting
		downCasting.show(p);
	}
}
