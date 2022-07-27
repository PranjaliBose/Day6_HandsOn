import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 
{

	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<>();
		list.add("Chair");
		list.add("Table");
		list.add("Copy");
		list.add("Cup");
		
		printAll(list);
		

	}
	public static void printAll(List<String> list)
	{
		Iterator<String> i=list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
	}

}
