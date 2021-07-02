import java.net.InetAddress;
import java.net.UnknownHostException;

public class networking 
{
	public static void main(String[] args) throws UnknownHostException
	{
		InetAddress adr = InetAddress.getLocalHost();
		System.out.println(adr);
		
		adr = InetAddress.getByName("www.studytonight.com");
		System.out.println(adr);
		
		InetAddress[] info = InetAddress.getAllByName("www.google.com");
		
		for(int i = 0; i < info.length; i++)
		{
			System.out.println(info[i]);
		}
	}
}
