
package collectionInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class B1_ArrayListInJava
{
	
	public static void main(String[] args)
	{
		
//1. add() and addAll() with index
		
		List<String> list= new ArrayList<>();
		
		System.out.println("Before adding element--"+list);
		
		boolean b1=list.add("Jaya");
		boolean b2=list.add("Lata");
		System.out.println("result-"+b1+""+b2+", list--"+list);	// [Jaya,Lata]
		
		List<String> addlist= new ArrayList<>();
		addlist.add("priya");
		addlist.add("shreya");
		
		list.addAll(addlist);
		System.out.println(list); //[Jaya, Lata, priya, shreya]
		
		list.add(1, "Sunil"); // add with index
		System.out.println(list);
		
		list.addAll(2, addlist);
		System.out.println(list);
		
		System.out.println("**************************************");

			
		
// 2. remove	(with object and index)	 
				
		List<String> birds=new ArrayList<String>();
		
		birds.add("bird1");  // [bird1]
		birds.add("bird2");  // [bird1, bird2]
		birds.add("bird3");  // [bird1, bird2, bird3]
		birds.add("bird4");  // [bird1, bird2, bird3 , bird4]
		
		System.out.println(birds.remove("bird1"));  // true [bird2, bird3 , bird4]
		
		System.out.println(birds.remove(1));  //return the name of removed element  bird3
		
		//System.out.println(birds.remove(100)); // [indexOutBoundException]	
		
		System.out.println("**************************************");
		
		
		
//3.   isEmpty() and size()
		
		System.out.println(birds.isEmpty());        // false
		System.out.println(birds.size());        // 2
		
		System.out.println("**************************************");
		
	
		
//4. clear()	
		/*void clear()*/
				
		birds.clear(); //[]
		System.out.println(birds.isEmpty());  //true
			
		System.out.println("**************************************");	
	
	
	
//5. contain()
		System.out.println(birds.contains("bird2")); // false beacuse list is empty
		birds.add("bird1");
		birds.add("bird2");
		System.out.println(birds.contains("bird2")); // true
			
		
	System.out.println("**************************************");	
		
//6. set()	
	List<String> list3 = new ArrayList<>();	
	
	list3.add("AB");   // [AB]
	list3.add(0, "AA"); //[AA, AB]
	//E set(int index, E e) Replaces element at index and returns original	
	list3.set(1, "BB");  // [AA, BB]
	//list.set(2, "CC");  // exception , because 2 index is not present	
	list3.add("CA");
	list3.set(2, "CC");
	list3.add("DD");
	System.out.println(list3); //[AA, BB, CC,DD]
	
		
	System.out.println("**************************************");		
		
		
//7 get()
	
	System.out.println("7."+list3.get(1)); //[BB]
	System.out.println("**************************************");		

//8.  indexOf
	System.out.println(list3.indexOf("CC"));// CC is present at 2 index	
	System.out.println(list3.indexOf("EE")); // -1 DD is not present	
	System.out.println("**************************************");	
	
//9. sublist
	System.out.println("sublist"+list3.subList(1, 2));
	

	System.out.println("looping a list/iterating a list");

	//1 way
	System.out.println("My list is --"+list);

	//++++++++++++++++++++++++++++++++++++++++

	System.out.println("1 way- normal for loop");
	for(int i=0; i<list.size();i++)
	{
		System.out.print(" "+list.get(i));
		
	}


	//+++++++++++++++++++++++++++++++++++++++++++
	System.out.println();  //space
	System.out.println("2 way -enhanced for loop");

	//3 way-- enhanced for loop
	for(String l:list)
	{
		System.out.print(" "+l);
	}

	System.out.println();  //space

	//++++++++++++++++++++++++++++++++++++++++++++	
		System.out.println("3 Using iterator");
		Iterator itr= list.iterator();
		while(itr.hasNext())  // hasNext() checks if there is a next value.
		{
			System.out.print(" "+itr.next()); //next() actually moves the Iterator to the next element.
		}

		//++++++++++++++++++++++++++++++++++++++++++++++++++++++
		System.out.println();  //space
				System.out.println("4th hybrid way  Using iterator");
				
				//4th hybrid way
				/*There’s also a hybrid way where you still use Iterator with generics. You get rid of the cast but still
				have to handle the looping logic yourself.*/

				List list1= new ArrayList();
				list1.add(new String("ABC"));
				

				Iterator<String> itr1=list1.iterator();
				while(itr1.hasNext())
				{
					System.out.print(" "+itr1.next());  
					
				}
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++
				System.out.println("");
		System.out.println("5th  Using Listiterator");
			
				
				List names= new ArrayList();  
				names.add("lion");
				names.add("Zebra");
				names.add("Tiger");
				names.add("Tiger1");
				
		ListIterator<String> namesIterator=names.listIterator();
	 
		while(namesIterator.hasNext())
		{
			System.out.print(" "+namesIterator.next());
		}
		System.out.println(" ");
		
		
		System.out.println("6th ListIterator using index"	);
		ListIterator namesIterator1=names.listIterator(1);

		while(namesIterator1.hasNext())
		{
			System.out.print(" "+namesIterator1.next());
		}
		
		
		
			System.out.println(" ");
		
		
		System.out.println("7th Iterator using for each"	);
		
		names.forEach((x) -> System.out.print(" "+x));
		
		
	
		
	}
}