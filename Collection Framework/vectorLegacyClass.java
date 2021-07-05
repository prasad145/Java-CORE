import java.util.Enumeration;
import java.util.Vector;

public class vectorLegacyClass {
	//synchronized (thread-safe)
	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(5);
		v.add(15);
		
		Enumeration<Integer> ee = v.elements();
		
		while(ee.hasMoreElements())
		{
			System.out.print(ee.nextElement() + " ");
		}
	}
}
