import java.util.Scanner;

public class anagram{

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a == null || b == null || a.equals("") || b.equals(""))
        {
            throw new IllegalArgumentException();
        } 
        
        if(a.length() != b.length())
            return false;
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        java.util.HashMap<Character , Integer> map = new java.util.HashMap<Character , Integer>();
        for(int j = 0; j < b.length(); j++)
        {
            char c = b.charAt(j);
            if(!map.containsKey(c))
            {
                map.put(c,  1);
            }
            else
            {
                Integer freq = map.get(c);
                map.put(c, ++freq);
            }
        }
        
        for(int i = 0; i < a.length(); i++)
        {
            char c = a.charAt(i);
            if(!map.containsKey(c))
            {
                return false;
            }
    
            Integer freq = map.get(c);
            if(freq == 0) 
                return false;
            else
                map.put(c, --freq); 
            
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
