class displayThread
{
	public void show(String msg)
	{
		System.out.print("[" + msg );
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class sample2Thread extends Thread
{
	String msg;
	displayThread disp;
	sample2Thread(displayThread d, String msg)
	{
		this.msg = msg;
		disp = d;
		start();
	}
	
	public void run()
	{
		synchronized(disp)
		{
			disp.show(msg);
		}
	}
}

public class synchronizedBlock
{
	public static void main(String[] args)
	{
		displayThread disp = new displayThread();
		sample2Thread t1 = new sample2Thread(disp, "Hello");
		sample2Thread t2 = new sample2Thread(disp, "Noob");
		sample2Thread t3 = new sample2Thread(disp, "Java coder");
	}
}


