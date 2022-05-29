package collectionInterface;

import java.util.ArrayList;
import java.util.List;

public class A3_DiamondOperator {
	
	public static void main(String[] args)
	{
		
		// What is diffence b/w below two lines
		List names = new ArrayList();		// Before java 5
		
		List<String> names1 = new ArrayList<String>();  // In java 5
		
		List<String> names2 = new ArrayList<>();  //in java 7 onwards, shortcut 
		
		//Why Diamond operator is required
	//	You had no way of knowing names were expected to contain String objects rather than StringBuilder 
		//or something else.
	
		
		//Example:1 : Issue before java5 
		
		
		List namelist= new ArrayList();
		
		namelist.add(new String("jaya"));
		namelist.add(new StringBuffer("jaya"));
		System.out.println("befor java 5 ");
		printNames(namelist);
		
		//Example:2 : in java5 
		
		List<String> fruitlist= new ArrayList<>();
		fruitlist.add(new String("orange")); // work properly
		System.out.println("After java 5 ");
		//fruitlist.add(new StringBuffer("orange"));   // DOES NOT COMPILE
	/* Getting a compiler error is good. You’ll know right away that something is wrong rather
		than hoping to discover it later.*/
		
	}
	
	static void printNames(List list)
	{
		for(int i=0; i<list.size();i++)
		{
			
		System.out.println(list.get(i));  // jaya

		//String name=(String)list.get(i); //EXCEPTION --java.lang.StringBuilder cannot be cast to java.lang.String
			
		
		}
			
		
	}

}
