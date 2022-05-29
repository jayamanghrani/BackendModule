package collectionInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class D2_QueueExampleInJava {

	public static void main(String[] args)
	{
		
		
		// LinkedList me order preserve rehta h , esliye jis order me dalenge vaise hi jayega
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(1);
		q.add(5);
		q.add(3);
		q.add(7);
		q.add(2);
		q.add(4);
		q.add(9);
		
		/*alternative way
		  for(int i=1; i<=7;i++)
		{
			q.add(i);
		}*/
		
		// Display contents of the queue.
		System.out.println("Display contents of the queue are --"+q);
		
		//  Retrieves and removes the head of this queue.
		System.out.println("remove head element- "+q.remove()); //FIFO -- deleting elements from the start of the list
		
		// Display contents of the queue.--
		System.out.println("Display contents of the queue --"+q);
				
		// Display head element of the queue.--		
		System.out.println("Display head element of the queue--"+q.peek());

        //Display
		System.out.println("Display head element of the queue--"+q.element());
		
	//  Retrieves and removes the head of this queue.
			System.out.println("remove head element- "+q.poll());
			
			
//*****************************************************************************************	
			
/*			using the Priority Queue class.
 * 			
 * 	there is difference in adding to priority or linked list
 * 
			1. Adding Elements: In order to add an element in a queue, we can use the add() method.
			The insertion order is not retained in the PriorityQueue.
			The elements are stored based on the priority order which is ascending by default. */
			
			
		Queue<Integer> q1= new PriorityQueue<Integer>();
		q1.add(5);
		q1.add(1);
		q1.add(7);
		q1.add(4);
		q1.add(6);
			
		System.out.println("Elements in priority queue-"+q1);	//[1,4,7,5,6]
			
		//  Retrieves and removes the head of this queue.
		System.out.println("remove head element- "+q1.remove()); //FIFO -- deleting elements from the start of the list
		
		// Display contents of the queue.--
		System.out.println("Display contents of the queue --"+q1);
				
		// Display head element of the queue.--		
		System.out.println("Display head element of the queue--"+q1.peek());

        //Display
		System.out.println("Display head element of the queue--"+q1.element());
		
	//  Retrieves and removes the head of this queue.
			System.out.println("remove head element- "+q1.poll());
			
				
		
		
//		********************************************************************
			
		Queue<String> q2 = new PriorityQueue<String>();
		q2.add("Jaya");
		q2.add("Akshta");
		q2.add("Babita");	
		q2.add("Lata");	
		q2.add("Coffee");	
			
		System.out.println(q2); //[Akshta, Coffee, Babita, Lata, Jaya]
		
		
		Iterator itr= q2.iterator();
		while(itr.hasNext())
		{
		System.out.print(" "+itr.next());
		}
		
		
	}
		
	
}
