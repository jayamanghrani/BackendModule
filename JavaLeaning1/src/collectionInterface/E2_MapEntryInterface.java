package collectionInterface;

public interface E2_MapEntryInterface {

	
	
	// Entry interface in Java provides certain methods to access the entry in the Map.
	//By gaining access to the entry of the Map we can easily manipulate them. 
	
	
/*	what is the reason behind the interface Map have inner interface Entry?
 * 
 * 

	Map<K,V> can be viewed as an associative storage (i.e. a container that connects keys to their values).
	 It can also be viewed as a collection of pairs, where the first element is the key, and the second element
	  is its corresponding value.
	
	The majority of methods in Map<K,V> supports the associative container view of the map. 
	Map.Entry<K,V> interface is there to support the other view of the map 
	- i.e. as a collection of key-value pairs.
 * 
 * 
 * One could have defined MapEntry<K,V> interface outside Map<K,V>.
 *  However, since the interface is very closely related to the map, 
 *  a decision to nest the interface inside the map makes perfect sense.
 * 
 * 
 * */
	
	
	
	
/*	public interface Map<K,V>
	{
				
	public static interface Map.Entry<K,V>			
		{
		
		1. K getKey()
			--the key corresponding to this entry
		
		
		2. V getValue()
			----the value corresponding to this entry
			
			
		3. 	V setValue(V value)
			---Replaces the value corresponding to this entry
			
			
		4. 	boolean equals(Object o)
			----e1.getKey().equals(e2.getKey())) 
		
		
		5. int hashCode()
			---Returns the hash code value for this map entry. 
					--(e.getKey()==null   ? 0 : e.getKey().hashCode()) 
			
			
		6. static <K extends Comparable<? super K>,V> Comparator<Map.Entry<K,V>> comparingByKey()	
			Returns a comparator that compares Map.Entry in natural order on key.
			
			Type Parameters:
					K - the Comparable type of then map keys
					V - the type of the map values
			
			
		7.static <K,V extends Comparable<? super V>> Comparator<Map.Entry<K,V>> comparingByValue()	
			Type Parameters:
					K - the type of the map keys
					V - the Comparable type of the map values
		
			
		8.	static <K,V> Comparator<Map.Entry<K,V>> comparingByKey(Comparator<? super K> cmp)
				Returns a comparator that compares Map.Entry by key using the given Comparator.
				Parameters:
					cmp - the key Comparator
			
			
		9.	static <K,V> Comparator<Map.Entry<K,V>> comparingByValue(Comparator<? super V> cmp)
			Returns a comparator that compares Map.Entry by value using the given Comparator.
			Parameters:
					cmp - the key Comparator
			
		}*/
	
	}
