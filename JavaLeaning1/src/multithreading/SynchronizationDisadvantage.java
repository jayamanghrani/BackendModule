package multithreading;

public class SynchronizationDisadvantage {

}

//Disadvantage of synchronization


		// Thread synchronization should be used when there is shared resource between threads

		//Java synchronized keyword incurs a performance cost. 
		/*A synchronized method in Java is very slow and can degrade performance.
		So use synchronization in java when it absolutely requires and
		consider using java synchronized block for synchronizing critical section only.*/


		//. Java synchronized block is better than java synchronized method in Java 
		/*because by using synchronized block you can only lock critical section of code 
		and avoid locking the whole method which can possibly degrade performance.
		A good example of java synchronization around this concept is getting Instance() method Singleton class.*/

/*		You cannot apply java synchronized keyword with variables
		and can not use java volatile keyword with the method.*/