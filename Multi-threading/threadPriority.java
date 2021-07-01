public class threadPriority extends Thread
{
	threadPriority(String s)
	{
		super(s);
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " is running!");
	}
	
	public static void main(String[] args)
	{
		threadPriority t1 = new threadPriority("Thread1");
		threadPriority t2 = new threadPriority("Thread2");
		t2.setPriority(5);
		t1.setPriority(1);
		t1.start();
		t2.start();
	}
}
