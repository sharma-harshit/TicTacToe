import java.io.*;
class car
{
    int wheels;
    int steering;
    
    //Name conflict arises
    car(int wheels , int steering)      
    {
        wheels = wheels ;
        steering = steering ;
    }
    //Resolving Conlflict
    car(int wheels , int steering)      
    {
        this.wheels = wheels ;
        this.steering = steering ;
    }
    
    
}
public class this_keyword
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        
    }
}
