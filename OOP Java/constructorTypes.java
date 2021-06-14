class test{
	String name;
	String team;
	int age;
	
	test()
	{
		name = "";
		team = "";
		age = 0;
	}
	
	test(String a, String b, int c)
	{
		name = a;
		team = b;
		age = c;
	}
	
	test(test obj)
	{
		name = obj.name;
		team = obj.team;
		age = obj.age;
	}
	
	public String toString()
	{
		return "this is " + name + " of "+team;
	}
}
public class constructorTypes {
	public static void main(String[] args)
	{
		test obj1 = new test();
		test obj2 = new test("Prasad", "India", 20);
		test obj3 = new test(obj2);
		obj1.name = "Virat";
		obj1.team = "India";
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}

}
