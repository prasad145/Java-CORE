import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap {
	public static void main(String[] args)
	{
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Sasori",1);
		hm.put("Hidan", 2);
		hm.put("kakuzu", 3);
		
		Set<Map.Entry<String, Integer>> m = hm.entrySet();
		for(Map.Entry<String, Integer> i : m)
		{
			System.out.println(i.getKey() + " " + i.getValue());
		}
	}
}
