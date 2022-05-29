package javaInterviewModule.ExceptionModule4;

public class B6_OutOfMemoryError {

}


//OutOfMemoryError



/**
 * The java.lang.OutOfMemoryError:when the application attempts to add more data into the heap space area,
 *  but there is not enough room for it.
 * 
 */

/*
 * To understand OutOfMemoryError we will first have to recall the jvm memory
 * structure.
 * 
 * There are two memory regions in the JVM: the heap and the stack.
 * 
 * Local variables,arguments and running copy of methods reside on the stack,
 * everything else on the heap.
 * 
 */


/*
 * This Java heap memory itself is structured again into two regions, called
 * generations
 * 
 * Young generation OR Heap (new se jo bnta h )-----128MB
 *  Old Generation OR PermGen (static var, string pool)
 */


/*
 * When heap area 128MB becomes full , then we get OutOfMemoryError
 */
