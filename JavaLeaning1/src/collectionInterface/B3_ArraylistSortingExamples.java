package collectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B3_ArraylistSortingExamples {

	public static void main(String[] args)
	{
		
		List<String> names = new ArrayList();
		
		names.add("Ajay");
		names.add("sneha");
		names.add("neha");
		names.add("simran");
		names.add("pooja");
		names.add("divya");
		
		System.out.println("before sorting--"+names);
		Collections.sort(names);
		System.out.println("After sorting--"+names);
		
		
	//	But If we don't want this type of sorting , so we can create by our own , using other methods of collections
	// Refer ArrayListSortingExample2	
		
		
	}	
}
