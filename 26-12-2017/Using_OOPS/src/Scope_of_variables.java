import java.io.*;
class car
{
    int wheels;
    int steering;       //data members
    void display()
    {
        int seats;      //local variable
        seats = 5;          //Constructor does not intialize local variables of functions
        System.out.println("Number of wheels : "+wheels+"\tNumber of steering : "+steering+"\tNumber of Seats : "+seats);
    }
}
public class Scope_of_variables
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        
    }
}
