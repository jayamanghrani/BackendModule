package javaInterviewModule.JavaBasicsmodule1;

import jdk.nashorn.internal.scripts.JO;

public class M1_JavaFeatures {

}


//Properties of java 

//1. Platform Independent- code can run on multiple platform without recompilation.
/*
 * (write once, run anywhere)
 * 
 * how to acheive platform independency?
 * 
 * 		By using JVM and bytecode
 * 
 * 		java compiler creates bytecode, JVM interpreter convert byte code into machine understandable form.
 * 
 * 		JVM is platform independent
 */
			


//2. Portable -  code can run on multiple platform but after recompilation,
				//Support multiple OS (Window , linux, Mac -- java sabpe chlti h , )

/* All high level lang are portable , but different OS me chlane ke liye  usme source code me edit krna pdhta h.
 * 
 * c is portable because its compiler are available for all platforms such windows, unix, Mac etc.
 * 
 * java is portable because its runtime environment i.e. JRE is available for all platforms.
 * */



//A lang which is plaform independent is definetaily portable.
//But if a lang is portable that doen't mean it is platform independent



/*
 * Java code kahi bhi chla sakte h , agar kuch features add kte h to h
 * compilation krna pdta h
 */

//Examples

//Portal but not platform independent
/* C, C++ */

//portable as well as platform independent
/*Java, python*/

//Non portable as well as platform independent
/* Visual Basic */



//3. Architecture Netural - means hardware independent
/*
 * (hardware change hone se farak nhi pdta , ex 32 bit or 64 bit pe data type ki
 * size change nhi hoti java me , jabki C me value change ho jati)
 * 
 * C me 
 * int - 2byte (16 bit)	Turbo
 * int - 4 byte (32 bit pe ) GCC
 * 
 * 
 * but java me esa nhi hota , yahi karan h java ne aaj tak sizeOf() nhi diya , java me sizeof() ki jarurah hi nhi , jab change nhi ho rha to 
 * 
 */
							

//4. Compiled as well as Interpreted

/*
 * Compiler JVM ke bahar hota h , interpreter JVM ke andar hota h.
 * 
 * compiler convert java code into bytecode and java interpreter execute that byte code into machine understandable form
 */




//5. Automatic Memory Mgmt

/*
 * Two types of memory 1.static --comes from stack 2.dynamic - comes from heap
 * 
 * In java , memory mgmt is taken care by the GC and is safe from memory
 * crashes.
 */

/*
 * What is heap size that JVM uses? 
 * JVM uses min - 1/64 of physical memory 
 * max-1/4 of physical memory
 * 
 */



//6. Object oriented
/*
 * java supports all - Encapsulation Inheritance Abstraction Polymorphism
 */


//7. Robust - bad programming will not impact, in that case java give exception

/*
 * if rules will violated then JVM kills the code by generating exception. ex.
 * ArrayIndexOutOfBound Ex FileNotFound
 * 
 */

//8. Simple

/*
 * C/C++ ki tarah hi h
 * 
 * 
 * can you name some features of C++ missing in java 
 * default Argument operator overloading
 *  multiple and hybrid inheritance(c++ me :: ese call ho jata tha , to ambuiguity nhi aati thi vaha)
 *  Inline function(func ka stack maintain krna ) , java me inline bnana ho to final kar do
 *  destructor and delete keyword - alternate in java finalize()
 *  Friend func (ye encapsulation nhi mante)
 *  
 *  can you name some features of C missing in java 
 * pointers -- java gives reference but utna freedom nhi h 
 * Typedef - java me esa nhi h , confusion ho jayega esse esliye java ne nhi diya
 * GoTo - alternative in java(label)
 * global variables
 * C me return type btana optional rehta h 
 */


//9. Stongly Typed

/* once you have assigned datatype , it can never change 
in javascript, python, php  we can change datatype , they are weekly typed

* type pta chlne se uski size bhi pta chl jati h java me ,ex. int - 4 byte 
*/



//10. Multithreaded

/*
 * our prog can do multiple task , many functionalities can run parallal
 * 
 * Benefits- 
 * 
 * 1. Save time -- proff
 * 
 * Our prog 
 * a) Read files from disc which takes around 5 sec.
 * b) process the file which takes around 2 sec
 * 
 * 
 * SIngle threaded model-       Multi threaded model
 * 1. Read file A.(5 sec)       1. Read File A(5 sec )
 * 2. process (2 sec)			2. Two thread (a File B read, Process File A ) 5 sec 
 * 3. Read file B(5 sec)        3. process file B (2 sec )
 * 4. process (2 sec)
 * 
 * Total = 14 sec              Total - 12 sec
 * 
 * 
 * 
 * 
 * if we will not use multithreading it will take more time, beacuse file read
 * ke time cpu I/O operation ke time free rehta h tab hmm multithreading krke es
 * time ko utilize kar sakte h
 * 
 * 
 * 
 * 
 * 
 * 
 * -------------------------------------------------------------------------------
 * 
 * 2. agr exception aayi , to baki part chlega , sirf utna part nhi chlega  jisme exception aayi h 
 * 
 * Threads are independent , so it doen't affect other thread if an exception occurs in a single thread
 * 
 * 
 * 
 * 3. sari coding main me krenge to main hang ho jayega , esliye diffrent method bnao and diff thread se unko call kro
 * 
 * 
 * 
 */
//11. Dynamic

/*
 * java me classes run time pe load hoti h , and it's responsibility take JRE
 * JO bhi new se bnta h usko runtime pe memory milti h , vo dynamic
 * 
 * Ex1
 * main() 
 * { 
 * -------
 *  ------- 
 *  Date d = new Date(); date ka obj run time pe bnega , this is dynamic 
 *  ------
 *  - 
 *  ------- 
 *  Scanner kb = new Scanner()
 * 
 * 
 * }
 * 
 * 
 * obj run time pe bnega to memory bhi run time pe denge.
 * agr man lo pehle se hi date ka obj bnta , memory milta aor 1st line pe error aa jaye , code aage na jaye to vo memory faltu jayegi
 * 
 * 
 * 
 * Ex2
 * if(test_cond)
 * {
 *   Student obj=new ..;
 * }
 * 
 * else
 * {
 *   Faculty obj= new ..;
 * }
 * 
 * 
 * 
 * if this is java code es code me ek hi obj bnega , vo decide hoga run time pe , agr run time pe decide nhi hota to faltu me do ban jayenge.
 * THis is called Lazy loading.
 * 
 * 
 * if ye coding C++ me hoti to 2 obj bnte
 * 
 * 
 * Drawbacks of Lazy loading
 * speed kam ho jata h.
 * 
 * C++ speed ke sath compromise nhi krti
 */



//12. Networked

/*
 * interconnectivity of 2 or more devices
 * 
 * java supports - 
 * 
 * LAN based networking --java.net 
 * 
 * WAN based networking----Servlet and jsp (server pe code rehta h , data client se aata h  [browser ----connect ---Web browser])
 * 
 * Distributed Networking-  in java we use RMI to make application distributed, or we use spring framework  
 * 
 * ex. SBI , we can access our SBI account by 4 ways-
 * 1.  mobile app
 * 2. Browser
 * 3. ATM machine
 * 4. by visit branch
 * 
 * This is distributed networking
 * 
 */


//13 Secure

/*
 * 1. java don't have pointers.
 * 2. Sandbox (environment where our prog run ) -
 * prog direct OS se communicate nhi krta , JVM se krta h
 * 
 */

//14. High performance

/*
 * jvm ke andar -
 * 
 * 1.interpreter - single line ko convert krta h machine understandable form me. (low performance)
 * 2. JITC - which convert whole bytecode to machine code  (High performance)
 * 
 */


//15. java use Multi core Architecture [Stream API ]
/* multi core cpu ki power ko java use krti h */


//Interview quest

/*
 * 1. Java bytecode--- it can run on any platform that has a JRE
 * 
 * 2. java is platform independent but JVM is platform dependent
 * 		java bytecode is platform independent but JVM is platform dependent
 * 
 * 
 * 
 */