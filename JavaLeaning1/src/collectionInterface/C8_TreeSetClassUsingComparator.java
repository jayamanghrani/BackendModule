package collectionInterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class C8_TreeSetClassUsingComparator {
	
	
	/* TreeSet have one method
	 * 
	 * 	public Comparator<? super E> comparator()
		Description copied from interface: SortedSet
		
		Returns the comparator used to order the elements in this set, or null if this set uses the natural ordering of its elements.
		Specified by:
		comparator in interface SortedSet<E>
		Returns:
		the comparator used to order the elements in this set, or null if this set uses the natural ordering of its elements*/
		
	public static void main(String[] args)
	{
	
	TreeSet<String> ts= new TreeSet();
    ts.add("jaya");
    ts.add("lata");
    ts.add("sunil");
    ts.add("harish");
    ts.add("babu");
    	
	// calling comparator method
	  Comparator comp=  ts.comparator();
	  
	// Displaying the comparator values
      System.out.println("Since the Comparator value is: "+ comp);// null
          
      for(String x:ts)
      {System.out.println(x);}   
      System.out.println("So  comparator follows natural ordering");
      
  
//	****************************************************************************
      //2nd way , if want to wite our own comparator, so pass it into constructor
      
      System.out.println("If we have given our own comparator");
      System.out.println("calling myComparator");
      TreeSet<String> ts1= new TreeSet<String>(new MyComparator());
      ts1.add("jaya");
      ts1.add("lata");
      ts1.add("sunil");
      ts1.add("harish");
      ts1.add("babu");
      
      
      for(String s: ts1)
      {
    	  System.out.println(s);
      }
      
//  	****************************************************************************    
      /*Can we sort StringBuffer using treeset*/
      
      System.out.println("Can we sort StringBuffer using treeset--No");
      TreeSet<StringBuffer> ts2= new TreeSet<StringBuffer>(new MyBufferComparator());
      ts2.add(new StringBuffer("jaya"));
      ts2.add(new StringBuffer("lata"));
      ts2.add(new StringBuffer("sunil"));
      ts2.add(new StringBuffer("harish"));
      ts2.add(new StringBuffer("babu"));
      
      
      for(StringBuffer s: ts2)
      {
    	  System.out.println(s);
      }
      
      
      
      
      
      
      
      
//	****************************************************************************      
 //     2nd is the only way , sort method is not available in Set
      
      Set<Integer> sint= new TreeSet();
      
        sint.add(1992);
	  	sint.add(1999);
	  	sint.add(1991);
	  	sint.add(1990);
	  	sint.add(1997);
	  	
	  	
	  	// sort method is not available in Set
	 /* 	Collections.sort(sint, new MyIntComparator());*/
	  	//The method sort(List<T>, Comparator<? super T>)  
	  	//in the type Collections is not applicable for the arguments (Set<Integer>, MyIntComparator)
	  	
	  	
	//  	since sort method don't take set, that's why in tree , we give comparator in constructor
	 // Collection sort method is  only for list
	  	
	}

}


class MyComparator implements Comparator<String>
{

	@Override
	public int compare(String str1, String str2) {
		
		System.out.println("String1"+str1);
		System.out.println("String2"+str2);
	
        return str2.compareTo(str1);
	}
	


}
class MyBufferComparator implements Comparator<StringBuffer>
{

	@Override
	public int compare(StringBuffer str1, StringBuffer str2) {
		
	
       // return str2.compareTo(str1); //Error :The method compareTo(StringBuffer) is undefined for the type StringBuffer
	
		return str2.toString().compareTo(str1.toString());
	}
	


}

class MyIntComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


