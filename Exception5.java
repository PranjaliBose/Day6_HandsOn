import java.util.Scanner;
public class Exception5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try
		{
			int c= division(a,b);
			System.out.println(c);
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}

	}
	public static int division(int a, int b)throws ArithmeticException
	{
		return a/b;
	}
}
