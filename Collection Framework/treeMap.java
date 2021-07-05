import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class treeMap {
	public static void main(String[] args)
	{
		TreeMap<Integer, Integer> t = new TreeMap<>();
		t.put(4, 3);
		t.put(1, 2);
		t.put(5, 3);
		t.put(3, 5);
		
		Set<Map.Entry<Integer, Integer>> tt = t.entrySet();
		for(Map.Entry<Integer, Integer> i: tt)
		{
			System.out.println(i.getKey() + " " + i.getValue());
		}
		
	}
}
