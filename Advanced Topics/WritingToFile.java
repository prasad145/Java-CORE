import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile 
{
	public static void main(String[] args)
	{
		try
		{
			File f =  new File("d:\\sample.txt");
			FileWriter fw = new FileWriter(f);
			String s = "Prasad!! No Luck, Total Loser!";
			fw.write(s);
			fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
