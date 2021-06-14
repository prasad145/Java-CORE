class parent
{
	public void show()
	{
		System.out.println("Hello I'm Parent");
	}
}

class upcasting extends parent{
	public void show()
	{
		System.out.println("Hello I'm Child");
	}
	
	public static void main(String[] args)
	{
		parent obj1 = new parent();
		upcasting obj2 = new upcasting();
		
		obj1.show();
		obj2.show();
		
		obj1 = obj2; // upcasting (calling the child class method through the instance of parent class)
		obj1.show();
	}
}