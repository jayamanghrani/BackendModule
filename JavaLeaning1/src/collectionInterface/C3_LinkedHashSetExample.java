package collectionInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class C3_LinkedHashSetExample {
	
	
	/*Java 4 onwards
	 * 
	 * Set doen't allow duplicates
	 * LinkedHashSet maintain insertion order  (ordered)
	 * No sorting
	 * same as hashset , only difference is that  , 
	 * Objects that you insert in LinkedHashSet are  guaranteed to be inserted/retrive in the same order.
	 * 
	 * LinkedHashSet checks whether there is an existing entry using hashCode() and equals() methods.
	 * Allow one null value
*/	
	
	public static void main(String[] args)
	{
		Set<Integer> s= new LinkedHashSet<Integer>();
		
		System.out.println(s.add(66)); // true
		System.out.println(s.add(8)); // true
		System.out.println(s.add(10)); // true
		System.out.println(s.add(66)); // false
		System.out.println(s.add(25)); // true
		System.out.println(s.add(15)); // true
		System.out.println(s.add(35)); // true
		
		System.out.println(s.add(null)); // true , 1 null value is allowed
		System.out.println(s.add(null));  // false
		
		
		s.remove(15);
		System.out.println("Size of set is -"+s.size());
			
			
		System.out.println("Iterating the Hashset---------");
			Iterator<Integer> itr= s.iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next()+" ");
			}
			

		
		
		
	}
	

}
