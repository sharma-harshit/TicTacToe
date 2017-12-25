import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
public class Array
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //Input size of array
        System.out.println("Enter size of array : ");
        int n = Integer.parseInt(br.readLine());
        // Creating / Declaring array
        int array[] = new int[n];
        int a[] = {10,20,30};
        // Inserting elements in array
        System.out.println("Enter "+n+" elements into the array");
        for(int i = 0 ; i < n ; i++ )
        {
            array[i] = Integer.parseInt(br.readLine());
        }
        //Displaying elements
        System.out.println("Elements in array : ");
        for (int i = 0; i < array.length; i++) 
        {
            System.out.println("Element " + (i+1) + " : " + array[i]);
        }
        //Sorting elements
        Arrays.sort(array);
          //Displaying elements
        System.out.println("Elements in array after sorting : ");
        for (int i = 0; i < array.length; i++) 
        {
            System.out.println("Element " + (i+1) + " : " + array[i]);
        }
        
    }
}