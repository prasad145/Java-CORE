import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashTable {
	public static void main(String[] args)
	{
		Hashtable<String, Integer> h = new Hashtable<>();
		h.put("Prasad", 21);
		h.put("Vamshi", 23);
		
		Set s = h.entrySet();
		Iterator i = s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry) i.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
