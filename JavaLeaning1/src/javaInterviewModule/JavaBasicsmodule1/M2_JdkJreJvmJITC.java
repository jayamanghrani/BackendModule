package javaInterviewModule.JavaBasicsmodule1;

public class M2_JdkJreJvmJITC {

}
 
// JDK  JRE  JVM  JITC

/*
 * JDK ke andar JRE hota h
 *  JRE ke andar JVM hota h 
 *  JVM ke andar JITC hota h
 */


// JVM contains ---

/* Java Virtual machine (java ka heart)
 * 
 *  1)responsible for converting byte code to the machine specific code.
 *  
 *  2)provide core functionality like memory mgmt, garbage collection, security.
 *  
 *  3)allocate min and max memory to JVM.
 *  
 *  (agr hme pta h ki hmare code me memory jada chaheye to hmm memory increase kr sakte h by using command
 *  
 *  java -Xms256m -Xmx4096m Test  [min - 256 megabyte , max- 4096] we can change default setting
 *  )
 *  
 *  
 *  4)JVM is dependent , every platform will have a different version of JVM
 *  
 *  5) JVM contain 2 translator -
 *  	Interpreter, JITC(Just in time compiler)
 *  
 *  
 *  */
 
//    Interpreter V/s  JITC

/*
 * how Interpreter works?
 * 
 * Java interpreter convert one line of byte code to machine language and send
 * it for execution to the computer. Then it repeats the same process for line 2.
 * 
 * drawback --
 * 
 * loop(100 times) 
 * { print ();
 * 
 * }
 * 
 * interpreter es loop ko 100 bar machine lang me convert krega
 * 
 * 
 * JITC---
 * 
 * 1997 me SUN ne ek nya compiler dala jiska naam diya JITC
 *     jisme loop/recursion vali chijo ka machine code save krke rkha jaye ,
 *     next time jab loop vapas chle to yehi machine use kr liya jaye
 * 
 * 
 * they thought - if a stmt has to be executed multiple times
 *  then why not save the converte code in computer memory and then the next time
 *  just execute it without converting it.
 *  
 *  		Execution of loop - 100 times
 *  		Convertion - 1 time 
 * 
 */	
 	
 	
 	// Java ko kaise pta chlta h ki kab Interpretor use krna h aor kab JITC use krna h?
 	
	/*
	 * java code chlane se pehle code ka analysis krti h , and un segment ko mark kr
	 * leti h jinpe JITC ko kaam krna h. esliye un segments ko java me hotspot kehte
	 * h
	 * 
	 * thus, Java JVM is also called JVM hostpot.
	 * 
	 * stmt which have to be executed multiple times are called Hotspot.
	 * 
	 * JITC me tabhi kam aayega  jab similar looking stmt ho ex. loop
	 */




//Interview question

//1.Are the java compiler and JITC same ?
	/*
	 * NO. java compiler part of JDK and it convert source code to byte code , and
	 * JITC convert bytecode to machine code
	 */




// JRE (Java runtime environment)

	/*
	 * JRE contain JVM , 
	 * it also contain java classes and packages(rt.jar--->C:\Program Files\Java\jdk1.8.0_05\jre\lib)
	 * 
	 * C:\Program Files\Java\jdk1.8.0_05\jre\lib\rt.jar\java\lang\ --.class file(bytecode)
	 * 
	 * 
	 * C:\Program Files\Java\jdk1.8.0_05\src.zip --- .java classes
	 * 
	 */
 	
 	
 	// Do you know the difference b/w java.exe and javaw.exe ?  both are inside(C:\Program Files\Java\jdk1.8.0_05\bin)

	/*
	 * Netbeans , eclipse, oracle sql developer sab java pe bne h
	 * 
	 * these all IDE when run then in background OS run --javaw.exe
	 * 
	 * 
	 * in java.exe--console gets freezed 
	 * in javaw.exe--console doesn't gets freezed, end user can use console
	 *
	 * 
	 * oracle sql developer ke pas JRE rehta h , beacuse ye software java GUI me bna h , usse hi run hota h 
	 */



// JDK (Java development kit)

	/*
	 * JDK contain JRE 
	 * library classes 
	 * java compiler
	 * jar , 
	 * additional files
	 * javap - java profile  (es cmd ko run krte h to pta chl jata h konse method and constructor h hmare class me )
	 * 
	 * cmd for javap-  javap Student.class

	 */

// can i compile a code if i have a JRE ---- No, JRE is used to run the application, it doen't contain javac tool

// which component is used to compile, debug, and execute java prog?--  JDK

// which component is used to optimize our java code -- JVM

// which component convert byte code to machine understandable form --JVM

//which component saves the converted machine specific code in computer's memory if required-- JITC

//which component is used to provide a platform to run a Java prog --JRE
 





//Why does Eclipse use its own Java compiler?
	/** Eclipse Java compiler allows customization of error and warning messages.
	 * 
	 *  The compiler in Eclipse allows to run a Java program even it still contains unresolved errors. 
	 *  For example, you have error in a method and you attempt to run the program, Eclipse will show a warning message 
	 *  
	  
	  . Eclipse Java compiler vs. javac compiler
	  
			  Since Eclipse Java compiler and javac compiler are different, 
			  they usually produce different error/warning message for the same issue. Consider this line of code:
				int x = “20”;
				
				In Eclipse, it will say:
				Type mismatch: cannot convert from String to int
				
				But javac will say:
				error: incompatible types: String cannot be converted to int
	 *  */

