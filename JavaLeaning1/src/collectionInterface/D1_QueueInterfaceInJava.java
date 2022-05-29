package collectionInterface;

public interface D1_QueueInterfaceInJava {

	
/*	The Queue interface present in the java.util package and extends the Collection interface
	is used to hold the elements about to be processed in FIFO(First In First Out) order.
	It is an ordered list of objects with its use limited to insert elements at the end of the list
	and deleting elements from the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out
	principle.*/
	
	
/*						Iterable(interface)
							|
							|
						Collection(interface)	
							|
							|
						 Queue(interface)------------------------------------------------------------------
						 	|												|	                         |
						 	|												|							 |	
						 Dequeue (interface)						PriorityQueue(class)			BlockingQueue 
						 	|																		eska pkg alag h from java.util.concurrent
						 	|																		eska purpose bhi alg h
			-------------------------------------			 												|
			|			 						|															|
			|									|															|
		LinkedList(class)					ArrayDequue(class)										PriorityBlockingQueue
			allow null						doesn't allow null
			*/
			
// WHat is use of queue??
	
/** without index , data access ho jaye.
 * 
 *  ex. DB se sare mail pick krke , sabko mail bhejna h --queue is best , only next method se ho jayega
 *  
 *  Arraylist me to index dena pdega , tab data milega , aor har time hmare pass index nhi hota.
 *  
 *  
 *  Ex-2 
 *  
 *  */
			
			
			
	/*Superinterface of Queue interface	
	All Superinterfaces:
		Collection<E>, Iterable<E>*/	
	/*method from superinterfaces: 
	 * add ,addAll, clear, contains, containsAll, equals, hashCode, isEmpty, iterator, remove, removeAll, retainAll, size, toArray, toArray*/
	
	
	
	/*Method in Queue:
	 * 
	 * 1. E poll()
		Retrieves and removes the head of this queue
	 * 
	 * 
	 * 2.E remove()
	 * Retrieves and removes the head of this queue.
	 * This method differs from poll only in that it throws an exception if this queue is empty. 
	 * 
	 * 
	 * 
	 * 2.E peek()
	 * Retrieves,the head of this queue, but does not remove, or returns null if this queue is empty.
	 * 
	 * 
	 * 3.E element()
		Retrieves the head of this queue, but does not remove or null if this queue is empty,
	 *This method differs from peek only in that it throws an exception if this queue is empty.
	 * 
	 * 
	 * 4.boolean offer(E e) 
	 * Returns:
			true if the element was added to this queue, else false
			Throws:
			ClassCastException - if the class of the specified element prevents it from being added to this queue
			NullPointerException - if the specified element is null and this queue does not permit null elements
			IllegalArgumentException - if some property of this element prevents it from being added to this queue
	 * 
	 * 
	 * 
	 * boolean add(E e)
	 * Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, 
	 * returning true upon success and throwing an IllegalStateException if no space is currently available.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	// Some imp point
	/** 1. child interface of collection 
	 * 
	 * 2. queue follow FIFO order but it is not necessary every implementation queue is based on FIFO.
	 * 
	 * 3. for ex-- PriorityQueue doesn't follow FIFO order for processing the element
	 * 
	 * FIFO hr jagah nhi chlta.
	 * 
	 * */
	
	
}
