import java.util.ArrayList;
import java.util.Collections;

public class collections {
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<>();
		a.add(3);
		a.add(2);
		a.add(1);
		a.add(7);
		a.add(5);
		
		Collections.sort(a);
		System.out.println(a);
		
		Collections.swap(a, 0, 4);
		System.out.println(a);
		
		Collections.reverse(a);
		System.out.println(a);
		
		System.out.println(Collections.min(a));
		System.out.println(Collections.max(a));
	}
}
