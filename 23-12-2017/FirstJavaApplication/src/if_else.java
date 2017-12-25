import java.io.*;
public class if_else
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter any character");
        char c = (char) br.read();
        if(c =='a' ||c =='o' ||c =='i' ||c =='e' ||c =='u')
        {
            System.out.println("Entered character is a vowel");
        }
        else
        {
            System.out.println("Not Vowel");
        }
    }
}
