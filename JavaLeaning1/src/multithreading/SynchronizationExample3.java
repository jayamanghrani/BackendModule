package multithreading;

class Printer2
{
	
	 public void print(String msg)
	{
		try {
			System.out.print("["+msg);	
			Thread.sleep(1000);
			System.out.println("]");
		}
		
		
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}  

}


class MyThread9 extends Thread
{
	
private String str;
private Printer2 p;


public MyThread9(String str,Printer2 p)
{
	this.str=str;
	this.p=p;
	start();
}


public void run()
{
	
	synchronized(p)                           // synchronization block, 
	{
	p.print(this.str);
	}
}

/*
 * Can we apply synchronization on run method , ye we can write no error but run
 * is not shared resource, synchronization should be applied with shared
 * resource only
 */





}

public class SynchronizationExample3 extends Thread {

	
public static void main(String[] args) {
	
	String s1= new String("Hello user");
	String s2= new String("Java Rocks");
	String s3= new String("Multithreading is fun user");
	
	
	Printer2 obj= new Printer2();
	
	MyThread9 m1= new MyThread9(s1, obj);
	MyThread9 m2= new MyThread9(s2, obj);
	MyThread9 m3= new MyThread9(s3, obj);
	
	
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
