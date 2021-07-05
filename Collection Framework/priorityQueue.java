import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {
	public static void main(String[] args)
	{
		PriorityQueue<String> p = new PriorityQueue<>();
		p.add("Hidan");
		p.add("Kakuzu");
		p.add("Deidara");
		p.add("Sasori");
		p.add("Akatsuki");
		p.poll();
		Iterator i = p.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		p.peek();
	}
}
