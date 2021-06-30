interface demo
{
	int speed = 90; // implicitly public static final
	void move(); // implicitly public abstract
	
}

public class interfaceImpl implements demo 
{
	public void move()
	{
		System.out.println("Speed is: " + speed);
	}
	
	public static void main(String[] args)
	{
		demo vehicle = new interfaceImpl();
		vehicle.move();
	}
}
