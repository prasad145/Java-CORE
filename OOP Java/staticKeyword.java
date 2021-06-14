class demo
{
	static int x = 1;
	int y = 1;
	
	void increment()
	{
		x++;
		y++;
	}
}

public class staticKeyword {
	public static void main(String[] args)
	{
		// for both the objects d1, d2 memory allocated for x only once because it is static
		// y is instance variable seperate memory assigned for y each time object created
		demo d1 = new demo();
		demo d2 = new demo();

		d1.increment();
		d2.increment();
		
		System.out.println("Y is: " +  d1.y);
		System.out.println("X is: " + demo.x);
	}
}
