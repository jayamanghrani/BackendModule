package multithreading;

//WA Multithreading application to display even and odd no 


class MyThread extends Thread
{
	
public MyThread(String name)
{
	super(name);
	System.out.println("details are -- "+this);

}
	
	
	public void run()
	{
		
		try
		{
		for(int i=2;i<10;i+=2)
		{
			System.out.println("even:"+i);
			Thread.sleep(500);
		}
		
		System.out.println(getName()+"finished");
		}
		catch(InterruptedException e)
		
		{
			System.out.println(getName()+"interrupted");
		}
	}



}


public class A2_MyThread {

	public static void main(String[] args) {
		
		MyThread obj = new MyThread("child");
		
		obj.start();
		

		try
		{
		for(int i=1;i<10;i+=2)
		{
			System.out.println("odd"+i);
			Thread.sleep(1000);
		}
		System.out.println(" main finished");
		}
		catch(InterruptedException e)
		
		{
			System.out.println(" main threadinterrupted");
		}
		
		
	}
	
	
}
