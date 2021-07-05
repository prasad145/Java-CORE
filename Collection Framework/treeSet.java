import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {
	public static void main(String[] args)
	{
		TreeSet<String> h = new TreeSet<>();
		h.add("Ravi");
		h.add("Vijay");
	    h.add("Ravi");
	    h.add("Ajay");
	    Iterator i = h.iterator();
	    while(i.hasNext())
	    {
	    	System.out.print(i.next() + " ");
	    }
	    System.out.println();
	    Iterator j = h.descendingIterator();
	    while(j.hasNext())
	    {
	    	System.out.print(j.next() + " ");
	    }
	    System.out.println();
		System.out.println(h);
	}
}
