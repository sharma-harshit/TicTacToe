import java.io.*;
public class right_upper_triangle
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Enter the number of rows of the matrix : ");
        int rows = Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns of the matrix : ");
        int columns = Integer.parseInt(br.readLine());
        
        char array[][] = new char[rows][columns];
        for(int i = 0 ; i < rows ; i++ )
        {
            for(int j = 0 ; j < columns ; j++ )
            {
                if(j>=i)
                array[i][j] = '*';
                else
                array[i][j] = ' ';
            }
        }
        for(int i = 0 ; i < rows ; i++ )
        {
            for(int j = 0 ; j < columns ; j++ )
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        
        
    }
}
