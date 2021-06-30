import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exceptionHandling 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		BufferedReader br = new BufferedReader(new FileReader("d:\\sample.txt"));
		try(br)
		{
			String s;
			while((s = br.readLine()) != null)
			{
				System.out.println(s);
			}
		}
		catch(IOException e)
		{
			System.out.println("exception occured " + e);
		}
	}
}
