import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class checkFilePermissions 
{
	public static void main(String[] args)
	{
		try
		{
			File f = new File("Demo.txt");
			boolean ok = f.exists();
			if(ok)
			{
				System.out.println(f.canRead());
				System.out.println(f.canWrite());
				System.out.println(f.canWrite());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
