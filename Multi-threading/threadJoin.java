public class threadJoin extends Thread
{
	public void run()
	{
		System.out.println("[" + Thread.currentThread() +"] running");
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("[" + Thread.currentThread() +"] ended");
	}
	
	public static void main(String[] args)
	{
		threadJoin t1 = new threadJoin();
		threadJoin t2 = new threadJoin();
		t1.start();
		try
		{
			t1.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		t2.start();
	}
}
