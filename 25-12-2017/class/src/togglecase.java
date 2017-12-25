import java.io.*;
public class togglecase
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter any String");
        String s = br.readLine(),ans="";
        
        for(int i = 0 ; i < s.length();i++)
        {
            if( Character.isLowerCase(s.charAt(i)))
            {
                ans += Character.toUpperCase(s.charAt(i)) ; 
            }
            else
            {
                ans += Character.toLowerCase(s.charAt(i)) ;
            }
        }        
        System.out.println(ans);
    }
}
