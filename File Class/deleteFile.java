import java.io.File;

public class deleteFile 
{
	public static void main(String[] args)
	{
		File f = new File("Demo.txt");
		if(f.exists())
		{
			if(f.delete())
			{
				System.out.println("File " + f.getName() + " delete Successfully");
			}
			else
			{
				System.out.println("Failed");
			}
		}
		else
		{
			System.out.println("File Not Found");
		}
	}
}
