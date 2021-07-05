import java.util.Enumeration;
import java.util.Stack;

public class stack {
	public static void main(String[] args)
	{
		Stack<Integer> st = new Stack<>();
		st.push(11);
		st.push(22);
		st.push(33);
		st.push(44);
		st.push(55);
		
		System.out.println(st.peek());
		
		Enumeration e = st.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement() + " ");
		}
		
		st.pop();
		st.pop();
		
		Enumeration e1 = st.elements();
		while(e1.hasMoreElements())
		{
			System.out.print(e1.nextElement() + " ");
		}
	}
}
