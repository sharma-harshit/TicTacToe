import java.io.*;
public class word_frequency
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Enter any String");
        String s = br.readLine();
        System.out.println("Enter any Word");
        String w = br.readLine();
        
        int pos = s.indexOf(w,0) , count = 0 ;
        while(pos != -1)
        {
           pos = s.indexOf(w,pos+1);
           count++;
        }
        System.out.println("Frequency is : "+ count);
    }
}
