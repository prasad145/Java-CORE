import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyFile 
{
	public static void main(String[] args)
	{
		FileInputStream a = null;
		FileOutputStream b = null;
		
		try
		{
			File f1 = new File("Demo.txt");
			File f2 = new File("Demo1.txt");
			
			a = new FileInputStream(f1);
			b = new FileOutputStream(f2);
			
			byte[] buffer = new byte[1024];
			int length;
			
			while((length = a.read(buffer)) >  0)
			{
				b.write(buffer, 0, length);
			}
			a.close();
			b.close();
			System.out.println("File Contents copied successfully!");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		
	}
}
