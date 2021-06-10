class returnObj {
	int a , b , c;
	returnObj(int x, int y, int z)
	{
		a = x;
		b = y;
		c = z;
	}
}
public class returnObject
{
	static returnObj show(int a, int b, int c)
	{
		return new returnObj(a*b, b*c, a*c); 
	}
	
	public static void main(String[] args) 
	{
		returnObj obj = show(1, 2, 3);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}
}
