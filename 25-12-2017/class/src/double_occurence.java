import java.io.*;
public class double_occurence
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter any String");
        String s = br.readLine();
        System.out.println("Enter any charcter");
        char ch = (char) br.read();
        
        if(s.length()<1)
        {
            System.out.println(" 0 ");
            return;
        }
        int occurence=0;
        s.trim();  
        for(int i = 0 ; i < s.length()-1;i++)
        {
            if( s.charAt(i) == ch && s.charAt(i+1) == ch)
            {
                occurence++;
                i++;
            }
        }
        
        System.out.println(occurence);
    }
}
