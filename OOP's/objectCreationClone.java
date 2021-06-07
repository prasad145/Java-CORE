
public class objectCreationClone implements Cloneable{
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	String s = "Hello";
	
	public static void main(String[] args)
	{
		objectCreationClone a = new objectCreationClone();
		try {
			objectCreationClone b = (objectCreationClone) a.clone();
			System.out.println(b.s);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
