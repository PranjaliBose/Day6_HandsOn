import java.util.ArrayList;
public class ArrayList1 
{

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add("January");
		a.add("February");
		a.add("March");
		a.add("April");
		a.add("May");
		a.add("June");
		a.add("July");
		a.add("August");
		a.add("September");
		a.add("October");
		a.add("November");
		a.add("December");
		
		System.out.println("Months are : ");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		

	}

}
