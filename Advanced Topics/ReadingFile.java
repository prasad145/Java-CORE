import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		try 
		{
			BufferedReader br  = new BufferedReader(new FileReader("d:\\sample.txt"));
			String s;
			while((s = br.readLine()) != null)
			{
				System.out.println(s);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
