import java.io.*;
public class StringBuffers
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        //declaring a String Buffer
        StringBuffer sb = new StringBuffer("Hello World!!!");
        
        //appending a string to sb
        sb.append(" this iss being appended");
        System.out.println(sb);
        
        //Inserting a string inside a Stringbuffer
        sb.insert(6,"Java ");
        System.out.println("Inserting Java at index 6 \t sb: "+ sb);
        
        //deleting characters from start to end
        sb.delete(5,8);
        System.out.println("deleting characters from 5 to 8\t"+sb);
        
        //set charAt function   -IMPORTANT
        sb.setCharAt(0,'A');
        System.out.println("setting 0th character to A\t"+sb);
        
        //reversing
        sb.reverse();
        System.out.println("Reversing the buffer\t"+sb);
        
       
    }
}
