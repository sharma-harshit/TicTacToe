import java.io.*;
public class no_of_words_in_string
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter any String");
        String s = br.readLine();
        if(s.length()<1)
        {
            System.out.println(" 0 ");
            return;
        }
        int word_count=0;
        s.trim();  
        for(int i = 0 ; i < s.length()-1;i++)
        {
            if( s.charAt(i) != ' ' && s.charAt(i+1) == ' ')
            {
                word_count++;
            }
        }
        
        System.out.println(word_count);
    }
}
