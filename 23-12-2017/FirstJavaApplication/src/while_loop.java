import java.io.*;
public class while_loop
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter any positive number");
        int n = Integer.parseInt(br.readLine());
        int i = 1 ; 
        while(i <= n)
        {
            System.out.println("Iterating : " + i);
            i++;
        }
    }
}
