class myThread implements Runnable
{
	public void run()
	{
		System.out.println("Concurrent thread started running...");
	}
}

public class creatingThreadUsingRunnableInterface 
{
	public static void main(String[] args)
	{
		myThread mt = new myThread();
		Thread t = new Thread(mt);
		t.start();
	}
}
