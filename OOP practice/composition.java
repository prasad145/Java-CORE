class engine{
	engine()
	{
		System.out.println("Engine started working");
	}
}
public class composition {
	//let us consider this class as car
	//here composition in the sense, car should have engine in order function
	//here composition is a design technique, not a feature of java
	engine eng;
	public static void main(String[] args)
	{
		engine eng = new engine();
	}
}
