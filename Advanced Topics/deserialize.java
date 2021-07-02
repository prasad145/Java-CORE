import java.io.FileInputStream;
import java.io.ObjectInputStream;
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

public class deserialize 
{
	public static void main(String[] args)
	{
		StudentInfo si = null;
		try
		{
			FileInputStream fis = new FileInputStream("D:\\sample.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			si = (StudentInfo) ois.readObject();
			System.out.println(si.name);
			System.out.println(si.age);
			System.out.println(si.id);
			System.out.println(si.Location);
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}
