package javaInterviewModule.ExceptionModule4;

public class A7_UncheckedException {

	public static void main(String [] args)
	{
	String[] students={"Amit","Sumit"};
	int pos=1;
	try
	{
	if(pos>0 && pos<=1)
		System.out.println(students[students.length]);
	}
	catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.println("exception- "+ex);
	}
	}
	
}

//UnChecked Exception(Runtime exceptions)

/*
 * A runtime exception is a representation of a programming error
 */
/*
 * For example,  NullPointerException which occurs when a piece of code tries to
 * execute some code on a variable that hasn’t been assigned an object and
 * points to null
 * 
 * Similarly , StringIndexOutOfBoundsException which occurs when we try to
 * access a string outside it’s index range
 */