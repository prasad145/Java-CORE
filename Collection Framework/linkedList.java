import java.util.LinkedList;

public class linkedList {
	public static void main(String[] args)
	{
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.addFirst(2);
		l.addLast(3);
		System.out.println(l);
	}
}
