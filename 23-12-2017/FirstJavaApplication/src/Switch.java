import java.io.*;
public class Switch
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter any character");
        char c = (char)br.read();
        switch(c)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' : System.out.println("Entered character is a vowel"); break;
            default: System.out.println("Entered character is not a vowel");
        }
    }
}
