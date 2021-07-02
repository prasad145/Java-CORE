import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReader 
{
	public static void main(String[] args) throws IOException
	{
		String s;
		InputStreamReader isp = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isp);
		s =  br.readLine();
		System.out.println(s);
	}
}
