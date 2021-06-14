class parent{
	
}

class child1 extends parent{
	
}

class child2 extends parent{
	
}

public class instanceOfKeyword {
	public static void main(String[] args)
	{
		parent p = new parent();
		child1 c1 = new child1();
		child2 c2 = new child2();
		
		System.out.println(c1 instanceof parent); //true
		System.out.println(c2 instanceof parent); //true
		
		System.out.println(p instanceof child1); //false
		System.out.println(p instanceof child2); //false
		
		p = c1; // upcasting
		System.out.println(p instanceof child1); // true
		System.out.println(p instanceof child2); // false
		
		p = c2;
		System.out.println(p instanceof child2); //true
		System.out.println(p instanceof child1); // false
	}
}
