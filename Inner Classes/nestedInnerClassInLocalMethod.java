class demo5{
	void display(int x, int y)
	{
		class inner{
			public void add(int x, int y)
			{
				System.out.println(x + y);
			}
		}
		
		inner i = new inner();
		i.add(x, y);
	}
}
public class nestedInnerClassInLocalMethod {
	public static void main(String[] args)
	{
		demo5 ob = new demo5();
		ob.display(4,5);
	}
}
