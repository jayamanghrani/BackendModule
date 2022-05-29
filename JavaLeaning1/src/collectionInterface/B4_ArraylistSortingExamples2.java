package collectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class B4_ArraylistSortingExamples2 {

	public static void main(String[] args)
	{
		
		List<String> names = new ArrayList();
	
		names.add("Ajay");
		names.add("sneha");
		names.add("neha");
		names.add("simran");
		names.add("pooja");
		names.add("divya");
	

		System.out.println("our list is --"+names);

		
		Collections.sort(names, new MyComparator1());
		
		System.out.println("After our own  sorting--"+names);
	}
}


class MyComparator1 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		
		// we can implement any other logic
		
	return	o1.compareTo(o2);
	}
	
	
	
}


