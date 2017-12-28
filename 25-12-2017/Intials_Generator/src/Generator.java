import java.io.*;
import java.util.*;
public class Generator
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Enter your Name");
        String name=br.readLine();
        System.out.println("Generating Intials");
//        time = new getTime();
        StringTokenizer st = new StringTokenizer(name);
        String output="";
        int n = st.countTokens();
        for (int i = 0; i < n-1; i++) 
        {
            String word=st.nextToken();
            output+=Character.toUpperCase(word.charAt(0))+". ";            
        }
        String word=st.nextToken();
        output += Character.toUpperCase(word.charAt(0));
        for (int i = 1; i < word.length(); i++) 
        {
            output += word.charAt(i);            
        }
        System.out.println("Congratulations intials have been generated : ");
        System.out.print(output);
        System.out.println("");
    }
}
