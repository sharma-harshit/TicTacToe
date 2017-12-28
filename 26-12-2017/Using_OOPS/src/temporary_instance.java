import java.io.*;
class car
{
    int wheels;
    int steering;
    car()                    //non-parameterized Constructor
    {
        wheels = 5;
        steering = 1;        
    }
    car(int a , int b)      //parameterized Constructor
    {
        wheels = a;
        steering = b;
    }
    void display()
    {
        System.out.println("Number of wheels : "+wheels+"\tNumber of steering : "+steering);
    }
}
public class temporary_instance
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        new car().display();
        new car(4,2).display();
    }
}
