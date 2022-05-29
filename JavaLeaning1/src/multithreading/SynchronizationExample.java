package multithreading;

class Printer
{
	
	public void print(String msg)
	{
		try {
			System.out.println("["+msg);	
			Thread.sleep(1000);
			System.out.println("]");
		}
		
		
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	} 

}


class MyThread7 extends Thread
{
	
private String str;
private Printer p;


public MyThread7(String str,Printer p)
{
	this.str=str;
	this.p=p;
	start();
}


public void run()
{
	p.print(this.str);

}



}

public class SynchronizationExample extends Thread {

	
public static void main(String[] args) {
	
	String s1= new String("Hello user");
	String s2= new String("Java Rocks");
	String s3= new String("Multithreading is fun user");
	
	
	Printer obj= new Printer();
	
	MyThread7 m1= new MyThread7(s1, obj);
	MyThread7 m2= new MyThread7(s2, obj);
	MyThread7 m3= new MyThread7(s3, obj);
	
	
	try
	{
		m1.join();
		m2.join();
		m3.join();
	}
	catch(Exception ex)
	{
		System.out.println(ex);
		
	}
	
}
	
	
	
	
}
