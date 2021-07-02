enum Student
{
	John(11), Bella(10), Sam(20), Prasad(20);
	private int age;
	private Student(int age)
	{
		this.age = age;
	}
	
	int getAge()
	{
		return age;
	}
}

public class EnumExample 
{
	public static void main(String[] args)
	{
		EnumExample e; // calls constructor, assigns respective age's
		System.out.println(Student.Prasad.getAge());
	}
}
