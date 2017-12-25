import java.io.*;
public class strings
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s1="hello world";
        String s2 = new String("hey world");
        
        //finding length
        System.out.println("Length of s1 : "+s1.length());
        System.out.println("Length of s2 :"+s2.length());
        
        //using charAt function
        System.out.println("Using charAt function to display contents of the String");
        for(int i = 0 ; i < s1.length();i++)
        {
            System.out.print(s1.charAt(i));
        }
        System.out.println("");
        
        //using indexOf function
        System.out.println("using indexOf function");
        System.out.println("Index of o in s1 "+s1.indexOf("o"));
        System.out.println("Index of o in s1 after index 5 "+s1.indexOf("o",5));

        //replace
        System.out.println("Using replace function");
        System.out.println("replacing l with * in s1 "+s1.replace("l","*"));
        System.out.println("s1 is : "+s1);
        s1 = s1.replace("l", "*"); //saving the replacement
        System.out.println("s1 is : "+s1);
        
        //using toUpperCase
        System.out.println("Using to Uppercase"+s1.toUpperCase());
        //using toLowerCase
        System.out.println("Using to Lowercase"+s1.toLowerCase());
        
        //using startsWith
        System.out.println("Using startsWith to check that s1 starts with he : "+s1.startsWith("he"));
        //using endsWith
        System.out.println("Using startsWith to check that s1 ends with r*d : "+s1.endsWith("r*d"));
        
        //using trim
        System.out.println("Using trim to eliminate starting and ending spaces "+s1.trim());
        
        //using subString
        System.out.println("Substring from 4 to 7 index : "+s1.substring(4,7));
        System.out.println("Substring from 4 to last index : "+s1.substring(4));
        
        //using concat
        System.out.println("Concate : s1 and s2 - " + s1.concat(s2));
        //using equals
        System.out.println("Checking s1 and s2 with equals : "+ s1.equals(s2));
        //using equalsIgnoreCase
        System.out.println("Checking s1 and s2 with equals : "+ s1.equalsIgnoreCase(s2));
        //compareTo
        System.out.println("Comparing s1 and s2 : "+s1.compareTo(s2));
        //compareToIgnore
        System.out.println("Comparing ignoring case s1 and s2 : "+s1.compareToIgnoreCase(s2));
        
   }
}
