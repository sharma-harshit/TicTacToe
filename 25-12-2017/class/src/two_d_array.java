import java.io.*;
public class two_d_array
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Enter the number of rows of the matrix : ");
        int rows = Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns of the matrix : ");
        int columns = Integer.parseInt(br.readLine());
        
        int array[][] = new int[rows][columns];
        for(int i = 0 ; i < rows ; i++ )
        {
            for(int j = 0 ; j < columns ; j++ )
            {
                System.out.println("Enter " +"[" +(i+1)+"]["+(j+1) +"] element");
                array[i][j] = Integer.parseInt(br.readLine());
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
