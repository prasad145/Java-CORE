public class threadJoinTime extends Thread
{
	threadJoinTime(String name)
	{
		super(name);
	}
	
	public void run()
	{
		System.out.println("[" + Thread.currentThread().getName() +"] running");
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("[" + Thread.currentThread().getName() +"] ended");
	}
	
	public static void main(String[] args)
	{
		threadJoinTime t1 = new threadJoinTime("Thead1");
		threadJoinTime t2 = new threadJoinTime("Thead2");
		
		t1.start();
		try
		{
			t1.join(1500); // waiting for t1 to finish
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		t2.start();
	}
}
