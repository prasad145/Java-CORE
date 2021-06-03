import java.io.*;
import java.util.*;

/*
    
Input (stdin)
He is a very very good boy, isn't he?

Expected Output
10
He
is
a
very
very
good
boy
isn
t
he

*/
public class regex_example {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s.trim().length() == 0 || s.trim().length() > 400000 )
        {
            System.out.println("0");
        }
        else
        {
            String[] word = s.trim().split("[ !,?.\\_'@]+");
            System.out.println(word.length);
            for(String x : word)
                System.out.println(x);
        }
        scan.close();
    }
}