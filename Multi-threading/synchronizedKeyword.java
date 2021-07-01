class display
{
	synchronized public void show(String msg)
	{
		System.out.print("[" + msg );
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class sampleThread extends Thread
{
	String msg;
	display disp;
	sampleThread(display d, String msg)
	{
		this.msg = msg;
		disp = d;
		start();
	}
	
	public void run()
	{
		disp.show(msg);
	}
}

public class synchronizedKeyword 
{
	public static void main(String[] args)
	{
		display disp = new display();
		sampleThread t1 = new sampleThread(disp, "Hello");
		sampleThread t2 = new sampleThread(disp, "Noob");
		sampleThread t3 = new sampleThread(disp, "Java coder");
	}
}


