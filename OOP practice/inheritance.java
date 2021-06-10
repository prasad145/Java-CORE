
class parent
{
	String name;
	public parent(String n)
	{
		name = n;
	}
}

public class inheritance extends parent
{
	String name;
	public inheritance(String n, String m){
		super(n);
		this.name = m;
	}
	
	public void show()
	{
		System.out.println(super.name + " " + this.name);
	}
	
	public static void main(String[] args)
	{
		inheritance inh = new inheritance("Prasad", "Acharya");
		inh.show();
	}
}
