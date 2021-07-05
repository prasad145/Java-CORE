import java.util.HashSet;

public class hashSet {
	public static void main(String[] args)
	{
		HashSet<Character> h = new HashSet<>();
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
