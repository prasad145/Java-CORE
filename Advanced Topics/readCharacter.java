import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readCharacter 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c = (char) br.read();
		System.out.println("Character is: " + c);
	}
}