import java.io.*;
class vertical_histogram
{
public static void main(String[] args) throws IOException
{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.println("Enter number");
	int num = Integer.parseInt(br.readLine());
        int array[] = new int[100];
        int k = 0;
        while(num!=0)
        {
            array[k] = num % 10 ;
            num = num / 10 ;
            k++;
        }
        for (int i = 0; i < k/2 ; i++ )
	{
            int temp = array[i];
            array[i] = array[k-i-1];
            array[k-i-1] =temp;
	} 
	int max = 0 ;
	for (int i = 0; i < k ; i++ )
	{
		if(array[i] > max)
		{
			max = array[i];
		}
	}
	char matrix[][] = new char[max][k];
	for (int i = 0 ; i < k; i++ )
	{
		for (int j = 0 ; j < max; j++) 
		{
			if(j<array[i])
			{
				matrix[j][i]= '*';
			}			
			else
			{
				matrix[j][i]= ' ';
			}
		}
	}
	for (int i = max -1 ; i >= 0 ; i-- )
	{
		for (int j = 0 ;j < k; j++) 
		{
			System.out.print(matrix[i][j]);
		}
                System.out.println("");
	}
}
}