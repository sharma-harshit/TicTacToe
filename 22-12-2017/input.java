import java.io.*;
class input
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter any String");
		String s = br.readLine();
		System.out.println("You entered the following string :- \t"+s+"\nNow enter an integer");
		int num = Integer.parseInt(br.readLine());
		System.out.println("Now, you have entered an integer i.e. "+ ++num +" incremented");
	}
}