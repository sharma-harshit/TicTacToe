import java.io.*;
public class method_overloading
{
    
    static void print(int num)
    {
        System.out.println(num);
    }
    
    static void print(int num1,int num2)
    {
        System.out.println(num1+" "+num2);
    }
    
    static void print(String s)
    {
        System.out.println(s);
    }
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        print(1);
        print(10,20);
        print("hello method overloading");
        
    }
}
