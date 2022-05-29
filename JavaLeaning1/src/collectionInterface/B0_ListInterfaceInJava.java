 package collectionInterface;

public interface B0_ListInterfaceInJava {

//	Contain All method by collection and iterable interface 

	
	
	
	// Extra method in List Interface
	
//1. boolean addAll(int index, Collection<? extends E> c)
			/*Parameters:
				index - index at which to insert the first element from the specified collection
				c - collection containing elements to be added to this list*/
	
//2. void add(int index, E element)	
	
		
	
//3. E get(int index)	
		/*Throws:
			IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())*/
	

//4.. E set(int index, E element)	
	/*Replaces the element at the specified position in this list
	throws- Exceptions*/


//5. E remove(int index)
	/*Throws:
		UnsupportedOperationException - if the remove operation is not supported by this list
		IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())*/
	
	
//5.. default void replaceAll(UnaryOperator<E> operator)	--1.8
				/*Replaces each element of this list with the result of applying the operator to that
				element. Errors or runtime exceptions thrown by the operator are relayed to the caller.*/
		
		
		
//6. default void sort(Comparator<? super E> c)---1.8
		
		/*c - the Comparator used to compare list elements. A null value indicates that
		the elements' natural ordering should be used
		
		Sorts this list according to the order induced by the specified Comparator.*/	
	
	
	
//7. int indexOf(Object o)	
		/*internal working -o.equals(get(i))), or -1 if there is no such index*/
	
	
	
//8. int lastIndexOf(Object o)
	 /*o.equals(get(i))), or -1 if there is no such index.*/
	

	
//9.ListIterator<E> listIterator()	
		/*Returns a list iterator over the elements in this list (in proper sequence).*/
	
	
	
//10. ListIterator<E> listIterator(int index)	
	
			/*Returns:
				a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list
				Throws:
				IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())*/
	
	
	
	
//11. List<E> subList(int fromIndex, int toIndex)	
                 /*list.subList(from, to)*/
	
}
