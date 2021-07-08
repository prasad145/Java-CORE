import java.io.File;

public class RetrievingFileInfo 
{
	public static void main(String[] args)
	{
		File f = new File("Demo.txt");
		if(f.exists())
		{
			System.out.println("File Name: "+ f.getName());
			System.out.println("File Absolute Path :" + f.getAbsolutePath());
			System.out.println(f.length());
		}
		else
		{
			System.out.println("File Not Found");
		}
	}
}
