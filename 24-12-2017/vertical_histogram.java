import java.io.*;
class vertical_histogram{
public static void main(String[] args) throws IOException
{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.println("Enter number of items:");
	int num = Integer.parseInt(br.readLine());
	int array[] = new int[num];
	int max = 0;
	for (int i = 0; i < num ; i++ )
	{
		array[i] = Integer.parseInt(br.readLine());
		if(array[i] > max)
		{
			max = array[i];
		}
	}
	char matrix[][] = new char[max][num];
	for (int i = 0 ; i < num; i++ )
	{
		for (int j = max ; j > 0; j--) 
		{
			if(array[i]<=j)
			{
				matrix[j][i]= '*';
			}			
			else
			{
				matrix[j][i]= ' ';
			}
		}
	}
	for (int i = 0 ; i < num; i++ )
	{
		for (int j = 0 ;j < max; j++) 
		{
			System.out.println(matrix[i][j]);
		}
	}
}
}