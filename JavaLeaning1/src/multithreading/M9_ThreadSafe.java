package multithreading;

public class M9_ThreadSafe {

/*	
	1) Immutable objects are by default thread-safe because their state
	can not be modified once created. Since String is immutable in Java, it's inherently thread-safe.
	
	2) 7) local variables are also thread-safe because each thread 
	has there own copy and using local variables is a good way to write thread-safe code in Java.
	
	3) 1) Use the synchronized keyword in Java and lock the getCount() method so that only one thread
	 can execute it at a time which removes the possibility of coinciding or interleaving.
	
	
	public class NumberCounter {
   	private int count;
   	AtomicInteger atomicCount = new AtomicInteger( 0 );
   	
		   public synchronized int getCount(){
		      return count++;
		   }
	
	If multiple thread call getCount() approximately same time each of these three operations may
	 coincide or overlap with each other for example while thread 1 is updating value, thread 2 reads
	  and still gets old value, which eventually let thread 2
	 override thread 1 increment and one count is lost because multiple threads called it concurrently.
	
	
	
	
	
	*/
}
