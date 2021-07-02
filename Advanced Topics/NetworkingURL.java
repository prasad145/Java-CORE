import java.net.MalformedURLException;
import java.net.URL;

public class NetworkingURL 
{
	public static void main(String[] args) throws MalformedURLException
	{
		URL adr = new URL("https://www.studytonight.com/java/");
		System.out.println(adr.getProtocol());
		System.out.println(adr.getHost());
		System.out.println(adr.getFile());
		System.out.println(adr.getPort());
	}
}
