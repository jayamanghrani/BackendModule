package collectionInterface;

public class A7_GenericMethod {

	
	static <T> void display(T obj)
	{
		System.out.println(obj.getClass().getName()+" = "+obj );
		
	}
	
	public static void main(String[] args)
	{
		A7_GenericMethod gm= new A7_GenericMethod();
		gm.display("hello"); //passing String obj
		gm.display(20);		// passing Integer obj
		gm.display(20.0);	// passing Double obj
		
	}
	
}
