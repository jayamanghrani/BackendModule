package collectionInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B5_LinkedListInJava {

	
	/* linkedlist
	 * 
	 * 1. it implement list interface , so it has index value , duplicate allowed, ordered
	 * 
	 * 2.it is slow than arraylist beacuse  while retrive data it doesn't check index 
	 * rather it traverse from head to tail
	 * 
	 * 3. it is good to use when have to do some manipulation in data like insert and delete
	 * 
	 * 4. It use doubly linkedlist, that's why it also implements dequeue interface
	 * 
	 * 
	 * 5. We have 2 option to use linkedlist - (List and Queue)
	 * 
	 * 6. If using list interface for linkedlist ,it stores data as index based,
	 *  can insert data in between, can remove any element
	 * 
	 * 7. If using queue interface for linkedlist, it stores data in FIFO style,
	 *  can insert only in end , and can remove only from head element
	 * 
	 * */
	
	
	public static void main(String[] args)
	{
		
		List<String> lt = new LinkedList<String>();
		lt.add("jaya");
		lt.add("Ankita");
		lt.add("lata");
		lt.add("chandni");
		lt.add("usha");
		lt.add("monika");
		
		
		System.out.println(lt);
	
		// remove by object or index vise
		/**
		 * lt.remove(2); System.out.println("After removing --"+lt);
		 */
		
		
		for(int i=0;i<lt.size();i++)
		{
			if(i==2)
			lt.remove(i);
		}
		System.out.println("After removing --"+lt);
		
		
		
		Iterator itr= lt.iterator();
		while(itr.hasNext())
		{
			/*if ((itr.next()) == "jaya")*/       /** java.util.ConcurrentModificationException  */
			/*lt.remove(1);  */
			
			System.out.print(" "+itr.next());
		}
		
		System.out.println("  ");//space
//**************************************************************************	
		
		Queue<String> q= new LinkedList<String>();
		q.add("jaya");
		q.add("Ankita");
		q.add("lata");
		q.add("chandni");
		q.add("usha");
		q.add("monika");
		
		// It follow FIFO(first in first out) , will remove by head only 
		q.remove();
		System.out.println(q);
		
	}
	
	
	
	
}
