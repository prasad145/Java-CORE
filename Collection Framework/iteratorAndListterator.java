import java.util.ArrayList;
import java.util.ListIterator;

public class iteratorAndListterator {
	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Hello");
		a.add("Word");
		a.add("Noob");
		System.out.println(a);
		
		ListIterator it = a.listIterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		while(it.hasPrevious())
		{
			System.out.print(it.previous() + " ");
		}
		
		for(String x: a)
		{
			System.out.print(x + " ");
		}
	}
}
