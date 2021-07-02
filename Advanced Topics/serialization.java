import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StudentInfo implements Serializable
{
	String name;
	int age;
	static int id;
	transient String Location;
	
	StudentInfo(String name, int age, int contact, String Location)
	{
		this.name = name;
		this.age = age;
		StudentInfo.id = contact;
		this.Location = Location;
	}
}

public class serialization 
{
	public static void main(String[] args) throws IOException
	{
		try 
		{
			StudentInfo si = new StudentInfo("Prasad", 21, 1, "Bangalore");
			FileOutputStream fos = new FileOutputStream("D:\\sample.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(si);
			oos.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
