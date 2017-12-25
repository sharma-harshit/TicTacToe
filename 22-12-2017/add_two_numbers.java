import java.io.*;
class add
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Please enter two numbers");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		System.out.println("Adding them.....\nSum is : "+(num1+num2));

	}
}