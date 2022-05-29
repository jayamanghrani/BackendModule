package multithreading;

public class Synchronization {

}


//What is synchronization

/*
 * In multithreaded env. there are many cases where two are more threads have to
 * access a common resource. This common resource can be any thing like a file ,
 * a device or even an objectr
 * 
 * 
 * For ex. consider a situation where two threads have seperate documents and
 * they want to print these documents
 * 
 * 
 */




//1. JVM guarantees that Java synchronized code will only be executed by one thread at a time. */

/*Whenever a thread enters into java synchronized method or blocks it acquires a lock and
whenever it leaves java synchronized method or block it releases the lock. 
The lock is released even if thread leaves synchronized method after completion 
or due to any Error or Exception.*/

//2. If your code is executing in a multi-threaded environment, you need synchronization for objects,
//which are shared among multiple threads, to avoid any corruption of state or any kind of unexpected behavior. 

/*synchronized keyword involves locking and unlocking. before entering into a synchronized method 
or block thread needs to acquire the lock, at this point it reads data from main memory 
than cache and when it releases the lock, it flushes write operation into main memory 
which eliminates memory inconsistency errors.*/


//3. Synchronization in Java will only be needed if a shared object is mutable. if your shared object is either
//a read-only or immutable object, then you don't need synchronization, despite running multiple threads. 

/*4.  You can have both static synchronized method and nonstatic synchronized method and 
synchronized blocks in Java but we can not have synchronized variable in java. */

//5. Instead of synchronized variable in Java, you can have java volatile variable,
//which will instruct JVM threads to read the value of the volatile variable from main memory 
//and don’t cache it locally.