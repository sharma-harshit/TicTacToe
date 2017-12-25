import java.io.*;
public class implementing_tokenizer
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String s = br.readLine();
        String word[] = new String[1000];
        int word_count = 0,j=0;
        for(int i = 0 ; i < s.length() ; i++ )
        {
            if(s.charAt(i)==' ')
            {
               
                j++;
            }
        }
        
        
    }
}
