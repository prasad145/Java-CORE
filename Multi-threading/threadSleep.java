public class threadSleep extends Thread 
{
	threadSleep(String name)
	{
		super(name);
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " started");
		try
		{
			threadSleep.sleep(1500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " finished");
	}
	
	public static void main(String[] args)
	{
		threadSleep t1 = new threadSleep("thread1");
		threadSleep t2 = new threadSleep("thread2");
		System.out.println("[" + t1.getName() + "] State: " + t1.getState());
		t1.start();
		System.out.println("[" + t1.getName() + "] State: " + t1.getState());
		System.out.println("[" + t2.getName() + "] State: " + t2.getState());
		t2.start();
		System.out.println("[" + t2.getName() + "] State: " + t2.getState());
	}
}
