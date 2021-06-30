import java.util.StringTokenizer;

public class stringTokenizer 
{
	public static void main(String[] args)
	{
		StringTokenizer st = new StringTokenizer("Hello, Thammellarige namaskara dear frands!");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		String b = "welcome : to : studytonight : how : are : you!";
		String a = ":";
		st = new StringTokenizer(b, a);
		int tokensCount = st.countTokens();
		System.out.println(tokensCount);
		
		for(int i = 1; i <= tokensCount; i++)
		{
			System.out.println("token[" + i + "] : " + st.nextToken());
		}
	}
}
