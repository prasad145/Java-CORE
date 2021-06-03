import java.util.*;
import java.io.*;



class new{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                else if(x >= -32,768 && x <= 32,767)
                else if(x >= -2,147,483,648 &&  x <= 2,147,483,647)
                else if( x >= -9,223,372,036,854,775,808 && x <= 9,223,372,036,854,775,807)
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



