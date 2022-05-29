package collectionInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B2_ArrayListExamples {
	
	
	public static void main(String[] args)
	{
			
		List<String> list= new ArrayList();
		
		list.add("Monday");
		list.add("Tuesday");
		list.add("Thrusday");
		list.add("Friday");
		list.add("Saturday");
		list.add("Sunday");
			
		list.add(2, "Wednesday");

		list.forEach((x) -> System.out.println(x));
		
//***************************************************************		
		List hetrodata= new ArrayList();
		hetrodata.add(15);
		hetrodata.add("Monday");
		hetrodata.add(15.8);
		
		System.out.println(hetrodata);
				
		hetrodata.forEach((x) -> System.out.println(x));
		
		Iterator itr= hetrodata.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		
		
	
		
		
	}
		
}
