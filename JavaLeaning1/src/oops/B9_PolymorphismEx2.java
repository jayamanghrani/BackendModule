package oops;

import java.io.FileNotFoundException;

public class B9_PolymorphismEx2 {

	
	public void show() throws FileNotFoundException
	{
		System.out.println("This show method can throw a exception");				
	}	
	
}


 class C1 extends B9_PolymorphismEx2
 {
	 @Override
	 public void show()              // while overridding we can neglect throws clause
	 {
		 System.out.println("Show of B ");
		 
		 
	 }	 
	 
 }
 
 class UseC1
 {
	 public static void main(String[] args) {
		
		 B9_PolymorphismEx2 obj = new C1();
			 
//		 obj.show();          error why ??
		 	
		 
/*		 In this code we are doing polymorphism and taken reference of B9 class and obj of c1 
		 
		 This code will not give any issue during run time but will failed at compilation
		 
		 and will give syntax error, since B9 ka show method is throwing  exception. 
		 
		 and we should handle it by either try catch or by throws  at method declaration */
		 
		 
		 try {
			obj.show();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
		 
		 
	}
	 
	 
 }
 
 
 