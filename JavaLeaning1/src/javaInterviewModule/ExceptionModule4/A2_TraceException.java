package javaInterviewModule.ExceptionModule4;

public class A2_TraceException {

	public static void main(String args[]) {
		method1();
	}

	public static void method1() {
		method2();
	}

	public static void method2() {

		String[] students = { "Shreya", "Joseph" };
		System.out.println(students[5]);
	}
}

//output
/** Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5 
 *  at javaInterviewModule.ExceptionModule4.A2_TraceException.method2(A2_TraceException.java:20)
	at javaInterviewModule.ExceptionModule4.A2_TraceException.method1(A2_TraceException.java:13)
	at javaInterviewModule.ExceptionModule4.A2_TraceException.main(A2_TraceException.java:7)
 * 
 * 
 * */
