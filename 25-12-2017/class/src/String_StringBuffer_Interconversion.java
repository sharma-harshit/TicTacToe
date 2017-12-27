import java.io.*;
public class String_StringBuffer_Interconversion
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        //converting String to StringBuffer
        String s1="hello";
        StringBuffer sb1 = new StringBuffer(s1);
        
        //converting StringBuffer to String
        StringBuffer sb2 = new StringBuffer("world");
        String s2 = sb2.toString();
    }
}
