class Generics<T, V> 
{	
	T ob;
	V a;
	
	Generics(T o)
	{
		ob = o;
	}

	<T, V extends String> void show(T t, V v) // V only accepts String, Wrapper class subclass Numbers wont be allowed as a parameter
	{
		System.out.println(t + " " + v);
	}
	
	public T getOb()
	{
		return ob;
	}
}

public class JavaGenerics
{
	public static void main(String[] args)
	{
		Generics<Integer, String> g = new Generics<>(100);
		System.out.println(g.getOb());
		g.show(100, "Prasad");
	}
}