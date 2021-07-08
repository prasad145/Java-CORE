import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile 
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter f = new FileWriter("Demo.txt");
			f.write("Hello, I'm Noob!");
			System.out.println("file overwritten!");
			f.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
