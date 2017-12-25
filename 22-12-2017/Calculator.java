import java.io.*;
class Calculator
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Hey there!!!\nWelcome to Simple Calculator\nPress any key to continue");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		char ch = (char) br.read();
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for division");
		char choice = (char) br.read();
		int result=0;
		if(choice == '1')
		{
			System.out.println("Adding :");
			int num1=Integer.parseInt(br.readLine());
			int num2=Integer.parseInt(br.readLine());
			result = num1+num2;
		}
		else if(choice == '2')
		{
			System.out.println("Subtracting :");
			int num1=Integer.parseInt(br.readLine()),num2=Integer.parseInt(br.readLine());
			result = num1-num2;
		}
		else if(choice == '3')
		{
			System.out.println("Multipling :");
			int num1=Integer.parseInt(br.readLine()),num2=Integer.parseInt(br.readLine());
			result = num1*num2;
		}
		else if(choice == '4')
		{
			System.out.println("Dividing :");
			System.out.println("Press 1 for Quotient");
			System.out.println("Press 2 for Remainder");
			char choice2= (char)br.read();
			if(choice2=='1')
			{
				System.out.println("\tFinding Quotient :");
				int num1=Integer.parseInt(br.readLine()),num2=Integer.parseInt(br.readLine());
				result = num1/num2;
			}
			else if (choice2=='2')
			{
				System.out.println("\tFinding Remainder:");
				int num1=Integer.parseInt(br.readLine()),num2=Integer.parseInt(br.readLine());
				result = num1%num2;
			}
			else
			{
				System.out.println("Please Enter correct Choice");
			}
		}
		else
		{
			System.out.println("Please Enter correct Choice");
		}
		System.out.println("Result is : " + result);
	}
}