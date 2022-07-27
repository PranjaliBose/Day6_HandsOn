import java.util.Scanner;

public class Exception6 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<2; i++) 
		{

			String StudentName = "";
			int sub1 = 0;
			int sub2 = 0;
			int sub3 = 0;
			
			try 
			{

				StudentName = sc.nextLine();
				
				if (sc.hasNextInt())
					sub1 = sc.nextInt();

				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					sub2 = sc.nextInt();

				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())

					sub3 = sc.nextInt();

				else
					throw new NumberFormatException();
				
				if (sub1 < 0) throw new Negative();
				if (sub1 > 100) throw new ValuesOutOfRangeException();
				
				if (sub2 < 0) throw new NegativeValuesException();
				if (sub2 > 100) throw new ValuesOutOfRangeException();
				
				if (sub3 < 0) throw new NegativeValuesException();
				if (sub3 > 100) throw new ValuesOutOfRangeException();
				
			} 
			
			catch (ArithmeticException e) 
			{

				System.out.println(e.getMessage());

			} 
			catch (NegativeValuesException e) 
			{

				System.out.println(e.getMessage());

			} 
			catch (ValuesOutOfRangeException e) 
			{

				System.out.println(e.getMessage());

			}
			
			System.out.println("Name: "+StudentName);
			System.out.println("Marks of subject 1: "+sub1);
			System.out.println("Marks of subject 2: "+sub2);
			System.out.println("Marks of subject 3: "+sub3);
		}
		
	
	}

}
