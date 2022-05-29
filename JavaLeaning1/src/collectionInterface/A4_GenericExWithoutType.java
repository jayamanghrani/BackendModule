package collectionInterface;

import java.util.ArrayList;
import java.util.List;

public class A4_GenericExWithoutType {

	public static void main(String[] args)
	{
		// Creatinga an ArrayList without any type specified
		ArrayList list= new ArrayList();
		list.add("jaya");
		list.add("lata");
		list.add(15); // Compiler allows this, (15 is primitive , Integer ka obj)
		list.add('a'); // allowed because we have not used generic type as String or Integer
		
		
		String value1= (String) list.get(0);
		String value2=(String) list.get(1);
		String value3=(String) list.get(2); // Causes Runtime Exception
		
		System.out.println(value3);
/*		How generics solve this problem? 
		At the time of defining ArrayList, we can specify that this list can take only String objects.*/
	//	generics java 5 onwards
		
		
		//Example2
		//void add(E element)
		
		List lt= new ArrayList();
		lt.add('c');  // E can be any element
		lt.add("aaa");
		lt.add(15);
		
		List<String> lt1= new ArrayList();
	//	lt1.add('c');  // E can be String only  , compile time error
		lt1.add("ccc");  
		
	}
	
}
