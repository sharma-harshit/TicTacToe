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
public class Constructor
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        car c1 = new car();   //non-parameterized Constructor gets called
        c1.display();
        car c2 = new car(6,2);   //Parameterized Constructor gets called
        c2.display();        
    }
}
