class demoThread extends Thread
{
	public void run()
	{
		System.out.println("Concurrent thread started running...!!");
	}
}

public class creatingThreadUsingThreadClass 
{
	public static void main(String[] args) 
	{
		demoThread mt = new demoThread();
		mt.start();
	}
}
