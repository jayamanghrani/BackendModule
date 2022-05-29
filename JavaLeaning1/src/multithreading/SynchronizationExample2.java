package multithreading;

class Printer1
{
	
	synchronized public void print(String msg)
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


class MyThread8 extends Thread
{
	
private String str;
private Printer1 p;


public MyThread8(String str,Printer1 p)
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

public class SynchronizationExample2 extends Thread {

	
public static void main(String[] args) {
	
	String s1= new String("Hello user");
	String s2= new String("Java Rocks");
	String s3= new String("Multithreading is fun user");
	
	
	Printer1 obj= new Printer1();
	
	MyThread8 m1= new MyThread8(s1, obj);
	MyThread8 m2= new MyThread8(s2, obj);
	MyThread8 m3= new MyThread8(s3, obj);
	
	
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
