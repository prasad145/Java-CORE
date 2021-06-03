import java.util.Scanner;
import java.util.regex.*;

public class pattern_regex
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		while(t>0){
			String pattern = in.nextLine();
          	//Write your code
              try
              {
                  Pattern.compile(pattern);
                  System.out.println("Valid");
              }
              catch(Exception e)
              {
                 //System.out.println(e);
                  System.out.println("Invalid");
              }
              t--;
		}
	}
}



