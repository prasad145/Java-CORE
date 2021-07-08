
public class WrapperObjectToPrimitive 
{
	public static void main(String[] args)
	{
		Double d =  4.567;
		byte b = d.byteValue();
		short s = d.shortValue();
		int i =  d.intValue();
		long l = d.longValue();
		double dd = d.doubleValue();
		float f = d.floatValue();
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(dd);
		System.out.println(f);
	}
}
