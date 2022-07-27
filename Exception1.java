
public class Exception1 
{

	public static void main(String[] args) 
	{
		int a;
		try
		{
			a=Integer.parseInt(args[0]);
			System.out.println("Square value : "+(a*a));
			System.out.println("The work has been done successfuly");
		
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered input is not a valid format for an integer.");
		}
	}

}
