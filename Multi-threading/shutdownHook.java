class demo extends Thread
{
	public void run()
	{
		System.out.println("These are some tasks needs to completed before JVM Shuts down!!");
		System.out.println("Shutdown hook task is now completed!");
	}
}

public class shutdownHook 
{
	public static void main(String[] args)
	{
		Runtime obj = Runtime.getRuntime();
		obj.addShutdownHook(new demo());
		
		System.out.println("Main method is now sleeping!...Press Ctrl+C");
		
		try 
		{
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}
