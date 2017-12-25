import java.io.*;
public class Main_Menu
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Hey there!!!\nWelcome to Calculator");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        
        int ch = Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1 :
            {
                System.out.println("Enter two numbers for ADDITION");
                String num = br.readLine();
                int num1 = Integer.parseInt(num);
                num = br.readLine();
                int num2 = Integer.parseInt(num);
                System.out.println("Adding....\nResult is "+(num1+num2));
                break;
            }
            case 2 : 
            {
                System.out.println("Enter two numbers for SUBTRACTION");
                int num1 = Integer.parseInt(br.readLine());
                int num2 = Integer.parseInt(br.readLine());
                System.out.println("Subtracting....\nResult is "+(num1-num2));
                break;
            }
            case 3 : 
            {
                System.out.println("Enter two numbers for MULTIPLICATION");
                int num1 = Integer.parseInt(br.readLine());
                int num2 = Integer.parseInt(br.readLine());
                System.out.println("Multipling....\nResult is "+(num1*num2));
                break;
            }
            case 4 : 
            {
                System.out.println("Enter dividend for DIVISION");
                int num1 = Integer.parseInt(br.readLine());
                System.out.println("Enter divisor for DIVISION");
                int num2 = Integer.parseInt(br.readLine());
                System.out.println("Dividing....\nQuotient of the Result is "+(num1/num2)+"\nRemainder of Result is "+(num1%num2));
                break;
            }
            default:
            {
                System.out.println("Enter correct choice");
            }
        }
    }
}
