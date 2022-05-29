package collectionInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class E3_HashMapExample {

	
/*	HashMap
	1. retriving Order is not fixed (Unordered)
	
	*2. No index
	*3. No duplicates key value pair 
	*HashMap doesn't allow duplicate keys but allows duplicate values
	*
	*4. use hashcode() to check duplicates
	*
	*5. It  implements Map, so insert data as key value form
	*
	*allow 1 null as a key, values can be null
	*
	*/
	
	
	
	public static void main(String[] args)
	{
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		
		mp.put("jaya", 31);
		mp.put("harish", 20);
		mp.put("sunil", 3);
		mp.put("poonam", 40);
		mp.put("lata", 26);		
		mp.put("pata", 25); 
		
		// to replace the key
		mp.put("lata", 25); // 
		mp.replace("harish", 21);
		
//		 If the map previously contained a mapping for the key, the old value is replaced by the specified value
		mp.put("harish", 31);
		
		System.out.println(mp);
		
		System.out.println("map.get(charcter)"+mp.get("pata"));
		
		 // using keySet() for iteration over keys
        for (String name : mp.keySet())
            System.out.println("key: " + name);
         
        // using values() for iteration over values
        for (Integer no : mp.values())
            System.out.println("value: " + no);
		
		
		System.out.println("iterating through loop-----------");
		
//		First of all, we cannot iterate a Map directly using iterators, because Map are not Collection. 
		 // Using entrySet() to get the entry's of the map	

		//Map. entrySet() method returns a collection-view(Set<Map. Entry<K, V>>) of the mappings contained in this map.
	
		
		//1st way
		Set<Map.Entry<String,Integer>> s = mp.entrySet();
		
		for(Map.Entry<String, Integer> xy: s)
		{
			System.out.print(xy.getKey());
			System.out.println(": "+xy.getValue());
		}
				


		//2nd way
        Set<Map.Entry<String,Integer>> s1 = mp.entrySet();
		
		for(Map.Entry<String, Integer> itr :s1)
		{
			System.out.print(itr.getKey());
			System.out.println(itr.getValue());
		}
//**********************************************************************************
		
		
		Map mymap = new HashMap();
		mymap.put("1","one");
		mymap.put("1","not one");
		mymap.put("1","surely not one");
		System.out.println("what happens when a duplicate key passed to hashmap----"+mymap.get("1"));
		
		
		
//	*********************************************************************************	
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(100,"a");
		map2.put(20,"c");
		map2.put(3,"b");
		map2.put(40,"e");
		map2.put(25,"d");
		
//	 If the map previously contained a mapping for the key, the old value is replaced by the specified value
		map2.put(25,"d");
		
		System.out.println("Map 2 is:");
		System.out.println(map2);
		
		
//	***********************************************************************************	
	
/*		we will see how hashmap’s get and put method works internally. What operations are performed. 
		How the hashing is done. How the value is fetched by key. How the key-value pair is stored.*/
		
	/*	Hashing

		Hashing is a process of converting an object into integer form by using the method hashCode().
		Its necessary to write hashCode() method properly for better performance of HashMap. 	
		*/
		
		
		
	}
	
	
	
}


// HashMap Vs Hashtable


/** hashtable not allow null in key and value.
 * 
 *  hashtable are synchronized
 *  
 *  
 *  
 *  
 *  
 *  
 *  */


