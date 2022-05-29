package collectionInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class C6_TreeSetClassExample {


	public static void main(String[] args)
	{
		
//		*************************************
		
		Set<String> s1= new TreeSet();   // if like this , will get all method of Iterable, collection,Set 
		
		SortedSet s2= new TreeSet(); // if like this , will get all method of Iterable, collection,Set ,SortedSet
				
		NavigableSet s3= new TreeSet();	// if like this , will get all method of Iterable, collection,Set ,SortedSet,NavigableSet
		
		
	
		
		
		
		NavigableSet<Integer> s= new TreeSet<Integer>();
		
	System.out.println(s.add(66)); // true
	System.out.println(s.add(8)); // true
	System.out.println(s.add(10)); // true
	System.out.println(s.add(66)); // false
	System.out.println(s.add(25)); // true
	System.out.println(s.add(15)); // true
	System.out.println(s.add(35)); // true
	System.out.println(s.add(45)); // true
	System.out.println(s.add(85)); // true
	//System.out.println(s.add(null)); // Exception
	
	System.out.println("");
	System.out.println("Our Set values are:"+s);
	
		//remove
			s.remove(15);
			System.out.println("Size of set after removal is -"+s.size());

			
		// Print the first element in the TreeSet	
			System.out.println("First value - "+s.first());

			
		 // Print the last element in the TreeSet
			System.out.println("Last--"+s.last());

			
			 Integer val = 10;			 
		        // Find the values just greater
		        // and smaller than the above string
		        System.out.println("Higher than 10 is- " + s.higher(val));
		        System.out.println("Lower than 10 is - " + s.lower(val));	
			
			
		        // Removing the first element
		        s.pollFirst();
		 
		        System.out.println("After removing first " + s);
		 
		        // Removing the last element
		        s.pollLast();
		 
		        System.out.println("After removing last " + s);
		        
	
System.out.println("Iterating the treeset---------");
	Iterator<Integer> itr= s.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
//*************************************************************************
	System.out.println("printing hertrogeneous objects");
	
	/* TreeSet does not allow the insertion of heterogeneous objects. 
	 It will throw a classCastException at Runtime if we try to add heterogeneous objects.
	
	 If we are depending on the default natural sorting order,
	 the objects that are being inserted into the tree should be homogeneous and comparable.*/ 
	 
	
	  Set heterodata= new TreeSet();
		
		// Elements are added using add() method 
		  heterodata.add("abc");
		  heterodata.add(20.5);
		  heterodata.add(15);
	 System.out.println(heterodata);//  java.lang.ClassCastException: 
	 
	
	
	
	//*************************************************************************	
	  System.out.println("inserting StringBuffer objects");
	  Set<StringBuffer> data= new TreeSet();
	
	
	// Elements are added using add() method
	data.add(new StringBuffer("A"));
	data.add(new StringBuffer("Z"));
	data.add(new StringBuffer("L"));
	data.add(new StringBuffer("B"));
	data.add(new StringBuffer("O"));

    // StringBuffer doesn't implements Comparable interface
    System.out.println(data); //ClassCastException-- StringBuffer class doesn’t implement Comparable interface. Hence, we get a ClassCastException in the above example.
	}
	
	
}


/*String and Wrapper classes implements Comparable
 * 
 * Ex: public final class Integer extends Number implements Comparable<Integer>
 * 
 * public final class String extends Object implements Serializable, Comparable<String>, CharSequence
 * 
 * 
 * StringBuffer doen't implement
 * 
 * public final class StringBuffer extends Object implements Serializable, CharSequence
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 	
		
	/*	Features of a TreeSet:
	 * TreeSet implements the SortedSet interface. So, duplicate values are not allowed.
	 * 
	 * Objects in a TreeSet are stored/retrieve in a sorted and ascending order.
	 * 
	 * TreeSet does not preserve the insertion order of elements.
	 * 
	 *	 
	 * The TreeSet can only accept generic types which are comparable.
	 * 
	 * An object is said to be comparable if and only if the corresponding class implements a Comparable interface.
	 * 
	 * 
	 * String class and all the Wrapper classes already implement Comparable interface
	 *  but StringBuffer class doesn’t implement Comparable interface.
	 * 
	 * 2. TreeSet serves as an excellent choice for storing large amounts of sorted information 
	 * which are supposed to be accessed quickly because of its faster access and retrieval time.
	 * 
	 * 
	 * 
	 * The insertion of null values into a TreeSet throws NullPointerException because while insertion of null,
	 *  it gets compared to the existing elements, and null cannot be compared to any value.
	 * 
			
		
			
			//Collections.sort(s);// The method sort(List<T>) in the type Collections is not applicable for the arguments (Set<Integer>)
	
	// we can't write like this in treeset because , treeset already sort krke deta h natural order me . 
	// esliye uske liye esa method nhi h 
			
		 */
		










//String ka comparable
//public int compareTo(String anotherString) {
//    int len1 = value.length;
//    int len2 = anotherString.value.length;
//    int lim = Math.min(len1, len2);
//    char v1[] = value;
//    char v2[] = anotherString.value;
//
//    int k = 0;
//    while (k < lim) {
//        char c1 = v1[k];
//        char c2 = v2[k];
//        if (c1 != c2) {
//            return c1 - c2;
//        }
//        k++;
//    }
//    return len1 - len2;
//}


// Integer ka compare

/*  public static int compare(int x, int y) {
return (x < y) ? -1 : ((x == y) ? 0 : 1);*/




