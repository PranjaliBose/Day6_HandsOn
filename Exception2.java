import java.util.Scanner;

public class Exception2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements : ");
		
		try
		{
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter index : ");
			int index=sc.nextInt();
			System.out.println("Element at index "+index+" is : "+arr[index]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException e)
		{
			System.out.println("java.lang.NumberFormatException");
			
		}

	}

}
