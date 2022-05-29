package collectionInterface;
import java.util.*;
public interface A1_IterableInJava{

	
	/*public interface Iterable<T>
	Implementing this interface allows an object to be the target of the "for-each loop" statement. 
	{
		  Iterator<T>    iterator();
		  
		  Spliterator<T> spliterator();
	
		  void           forEach(Consumer<? super T> action);-----1.8
		}
		1.5 onwards
		*/


//*******************************************************************
//	Method Detail
	
	
/*	iterator
	Iterator<T> iterator()
	Returns an iterator over elements of type T.
	Returns:
	an Iterator.*/
	
	
	
	
/*	forEach
	default void forEach(Consumer<? super T> action)
	Performs the given action for each element of the Iterable until all elements 
	have been processed or the action throws an exception. Unless otherwise specified by the implementing class, actions are performed in the order of iteration (if an iteration order is specified). Exceptions thrown by the action are relayed to the caller.
	Implementation Requirements:
	The default implementation behaves as if:


	     for (T t : this)
	         action.accept(t);
	 
	Parameters:
	action - The action to be performed for each element
	Throws:
	NullPointerException - if the specified action is null
	Since:
	1.8*/
	
	//*******************************************************************	
	
/*	spliterator
	default Spliterator<T> spliterator()
	Creates a Spliterator over the elements described by this Iterable.
	Implementation Requirements:
	The default implementation creates an early-binding spliterator from the iterable's Iterator. The spliterator inherits the fail-fast properties of the iterable's iterator.
	Implementation Note:
	The default implementation should usually be overridden. The spliterator returned by the default implementation has poor splitting capabilities, is unsized, and does not report any spliterator characteristics. Implementing classes can nearly always provide a better implementation.
	Returns:
	a Spliterator over the elements described by this Iterable.
	Since:
	1.8	*/
	
}
