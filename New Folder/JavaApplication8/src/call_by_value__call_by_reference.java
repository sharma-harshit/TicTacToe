import java.io.*;
public class call_by_value__call_by_reference
{
    //Call by Value
    static void swap(int num1,int num2)
    {        
        System.out.println("Before Swapping from swap function: "+num1+"\t num2 : "+num2);
        num1+=num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After Swapping from swap function : "+num1+"\t num2 : "+num2);
    }
    
    
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int num1 =10 , num2= 20;
        //call by value
        swap(num1,num2);
        System.out.println("Swapping with call by Value \nnum1 : "+num1+"\t num2 : "+num2);
    }
}
