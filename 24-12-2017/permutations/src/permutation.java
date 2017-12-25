import java.io.*;
public class permutation
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        int length =0 ;
        for(int i = 0 ; i<str.length() ;i++)
        {
            for(int j= i+1 ; i<str.length();j++)
            {
                String temp =str;
                
                System.out.println("Permutation : "+str);
            }
        }
    }
}
