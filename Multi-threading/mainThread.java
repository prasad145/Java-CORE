public class mainThread 
{
	public static void main(String[] args)
	{
		Thread t = Thread.currentThread();
		t.setName("Main-Thread");
		System.out.println("Thread running is: [" + t.getName() + " " + t.getPriority() +  " " + t.getId()+ " " + t.getState() + "]");
	}
}
