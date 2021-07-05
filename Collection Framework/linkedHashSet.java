import java.util.LinkedHashSet;

public class linkedHashSet {
	public static void main(String[] args)
	{
		LinkedHashSet<Character> h = new LinkedHashSet<>();
		h.add('f');
		h.add('a');
		h.add('a');
		h.add('b');
		h.add('b');
		h.add('c');
		h.add('c');
		System.out.println(h);
	}
}
