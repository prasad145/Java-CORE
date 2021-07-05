import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Hello");
		a.add("Word");
		a.add("Java");
		Collections.sort(a);
		System.out.println(a);
	}
}
