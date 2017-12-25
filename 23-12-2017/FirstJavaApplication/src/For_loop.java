import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class For_loop
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter any positive number");
        int n = Integer.parseInt(br.readLine());
        for( int i = 1 ;i <= n ; i++ )
        {
            System.out.println("Iterating : " + i);
        }
    }
}
