package javaInterviewModule.ExceptionModule4;

public class A1_ExceptionBasics {

}


//What Happens Internally When An Exception Occurs ?

/*
 * When an exception occurs within a method, the method creates an exception
 * object(contains information about the error) and hands it off to the runtime
 * system.
 * 
 * 
 * The runtime system searches the call stack for a method that contains an
 * exception handler.
 * 
 * if runtime system  searches all the methods on the call stack 
   without finding an appropriate exception handler,then the runtime system
   terminates and uses the default exception handler
 * 
 */

/** this message will be displayed */
/* Exception in thread "main" java.lang.ArithmeticException: */ // error msg 
/* at DivByZero.main(DivByZero.java:3) */ //stack trace



// Can't we write code with if else condition instead of using exception handling

/*
 * Yes , we can write using if else, but 
 * 1) code will become lengthy and not presentable.
 * 2) Code will not be readable , very complex.
 * 
 */

