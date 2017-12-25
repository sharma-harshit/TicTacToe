import java.io.*;
public class do_while
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter any positive number");
        int n = Integer.parseInt(br.readLine());
        int i=1;
        do
        {
            System.out.println("Iterating : " + i);
            i++;
        }
        while(i<n);
    }
}