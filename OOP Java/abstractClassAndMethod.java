abstract class vehicle
{
	public abstract void engine();
}

public class abstractClassAndMethod extends vehicle 
{
	public void engine()
	{
		System.out.println("Engine Implementation");
	}
	
	public static void main(String[] args)
	{
		vehicle v = new abstractClassAndMethod(); //Upcasting
		v.engine();
	}
}
