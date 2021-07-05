import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;

public class linkedTreeMap {
	public static void main(String[] str)
	{
		LinkedHashMap<Integer, Integer> t = new LinkedHashMap<Integer, Integer>();
		t.put(4, 3);
		t.put(1, 2);
		t.put(5, 3);
		t.put(3, 5);
		
		Set<Map.Entry<Integer, Integer>> tt = t.entrySet();
		
		for(Map.Entry<Integer, Integer> x: tt)
		{
			System.out.println(x.getKey() + " " + x.getValue());
		}
	}
}
