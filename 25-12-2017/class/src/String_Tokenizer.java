import java.io.*;
import java.util.*;
public class String_Tokenizer
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        //declaring StringTokeizer
        String  s = "hello baby how are you darling i am missing you alot ";
        StringTokenizer st = new StringTokenizer(s);
        
        //counting number of tokens
        System.out.println("Number of tokens\n : "+ st.countTokens());
        
        //accessing Tokens
        int tokens = st.countTokens();
        for (int i = 0; i < tokens ; i++)   // dont use count function directly here
        {
            System.out.println(st.nextToken());
        }
    }
}
