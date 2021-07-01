public class daemonThread extends Thread
{
	public daemonThread(String name)
	{
		super(name);
	}
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(getName() + " is Daemon thread and priority is: [" + Thread.currentThread().getPriority() + "]");
		}
		else
		{
			System.out.println(getName() + " is user thread!");
		}
	}
	
	public static void main(String[] args)
	{
		daemonThread t1 = new daemonThread("Thread1");
		daemonThread t2 = new daemonThread("Thread2");
		daemonThread t3 = new daemonThread("Thread3");
		
		t1.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
