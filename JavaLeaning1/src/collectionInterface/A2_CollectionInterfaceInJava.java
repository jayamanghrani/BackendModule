package collectionInterface;

public class A2_CollectionInterfaceInJava {

/*	This interface is from java 1.2 onwards
	
	Method Detail*/
	
//	1. int size()
		
			/*Returns the number of elements in this collection. 
			If this collection contains more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
			Returns:
			the number of elements in this collection*/
	
	
	
// 2. 	isEmpty
			/*boolean isEmpty()
			Returns true if this collection contains no elements.
			Returns:
			true if this collection contains no elements*/
	
	
	
//3. boolean contains(Object o)
			/*Returns true if this collection contains the specified element. More formally, returns true if and only if this collection contains at least one element e such that (o==null ? e==null : o.equals(e)).
			Parameters:
			o - element whose presence in this collection is to be tested
			Returns:
			true if this collection contains the specified element
			Throws:
			ClassCastException - if the type of the specified element is incompatible with this collection (optional)
			NullPointerException - if the specified element is null and this collection does not permit null elements (optional)*/
	
	
	
//4.Iterator<E> iterator()
			/*Returns an iterator over the elements in this collection. 
			 * There are no guarantees concerning the order in which the elements are returned 
			 * (unless this collection is an instance of some class that provides a guarantee).
			Specified by:
			iterator in interface Iterable<E>
			Returns:
			an Iterator over the elements in this collection	*/
	
	
	
//5. 	Object[] toArray()
	/*Returns an array containing all of the elements in this collection. If this collection makes any guarantees as to what order its elements are returned by its iterator, this method must return the elements in the same order.
			The returned array will be "safe" in that no references to it are maintained by this collection. (In other words, this method must allocate a new array even if this collection is backed by an array). The caller is thus free to modify the returned array.

			This method acts as bridge between array-based and collection-based APIs.

			Returns:
			an array containing all of the elements in this collection*/
	
	
//6. <T> T[] toArray(T[] a) ---> collection into array
	
			/*Suppose x is a collection known to contain only strings.
			The following code can be used to dump the collection into a newly allocated array of String:
		
			     String[] y = x.toArray(new String[0]);
			
			Returns:
			an array containing all of the elements in this collection*/
	
	
	
//7. boolean add(E e)
	
		/*Collections that support this operation may place limitations on what elements may be added to
		this collection. In particular, some collections will refuse to add null elements, and others will 
		impose restrictions on the type of elements that may be added.*/
			/*Throws:
				UnsupportedOperationException - if the add operation is not supported by this collection
				ClassCastException - if the class of the specified element prevents it from being added to this collection
				NullPointerException - if the specified element is null and this collection does not permit null elements
				IllegalArgumentException - if some property of the element prevents it from being added to this collection
				IllegalStateException - if the element cannot be added at this time due to insertion restrictions*/
			
	
//8. boolean remove(Object o)	
	
			/*Returns:
				true if an element was removed as a result of this call
				Throws:
				ClassCastException - if the type of the specified element is incompatible with this collection (optional)
				NullPointerException - if the specified element is null and this collection does not permit null elements (optional)
				UnsupportedOperationException - if the remove operation is not supported by this collection*/
			
	
// 9.boolean containsAll(Collection<?> c)	
			
			/*Returns:
				true if this collection contains all of the elements in the specified collection
				Throws:
				ClassCastException - if the types of one or more elements in the specified collection are incompatible with this collection (optional)
				NullPointerException - if the specified collection contains one or more null elements and this collection does not permit null elements (optional), or if the specified collection is null.
				See Also:
				contains(Object)*/
	
	
// 10. boolean addAll(Collection<? extends E> c)
			/*Parameters:
				c - collection containing elements to be added to this collection
				Returns:
				true if this collection changed as a result of the call
				Throws: Exceptions */
	
	
// 11. boolean removeAll(Collection<?> c)	
				/*c - collection containing elements to be removed from this collection
				Returns:
				true if this collection changed as a result of the call
				Throws: Exceptions*/

	
//12. default boolean removeIf(Predicate<? super E> filter)	---1.8 onwards
			/*Returns:
				true if any elements were removed
				Throws:Exceptions*/
	
	
//13. boolean retainAll(Collection<?> c)	
	
	
//14. void clear()
			/*Removes all of the elements from this collection 
			Throws:
				UnsupportedOperationException - if the clear operation is not supported by this collection*/
	
//15. boolean equals(Object o)	
			/*Overrides:
				equals in class Object*/
	
	
//16. int hashCode()		
	/*Overrides:
		hashCode in class Object*/
	

//Below 3 are used in spilitItrator	
	
//17. default Spliterator<E> spliterator()	
	
	/*Specified by:
		spliterator in interface Iterable<E>*/	
	
//18.default Stream<E> stream()
//19. default Stream<E> parallelStream()	
}
