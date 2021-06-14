
public class objectCreationNewInstance {
	String s = "Hello";
	
	public static void main(String[] args)
	{
		try 
		{
			Class another = Class.forName("objectCreationNewInstance");
			@SuppressWarnings("deprecation")
			objectCreationNewInstance obj = (objectCreationNewInstance) another.newInstance();
			System.out.println(obj.s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
