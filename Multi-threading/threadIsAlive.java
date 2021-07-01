public class threadIsAlive extends Thread
{
	public void run()
	{
		System.out.println("thread [" + Thread.currentThread() +"] running");
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("thread [" + Thread.currentThread() +"] ended");
	}
	
	public static void main(String[] args)
	{
		threadIsAlive t1 = new threadIsAlive();
		threadIsAlive t2 = new threadIsAlive();
		
		t1.start();
		t2.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());	
	}
}
