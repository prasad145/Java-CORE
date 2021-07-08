import java.io.File;
import java.io.IOException;

public class createNewFile 
{
	public static void main(String[] args)
	{
		try
		{
			File f = new File("Demo.txt");
			if(f.createNewFile())
			{
				System.out.println("~~~~New File Created~~~~");
				System.out.println("Name of the File: " + f.getName());
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
