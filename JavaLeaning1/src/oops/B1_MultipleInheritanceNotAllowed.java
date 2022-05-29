package oops;

//Java doen't support multiple inheritance

//Why?

class A {

	void show()
	{
		System.out.println("A show");
	}
}


class B {

	void show()
	{
		System.out.println("B show");
	}
}
/*
class C extends A,B {

public static void main(String[] args) {
	C obj= new C();
	c.show();   // using inheritance , we will get all methods of super class
}	 
}
*/


//Reason
/*1) First reason is ambiguity around the Diamond problem
   compiler will not be able to decide which show() it should invoke. 

2)Also, java avoids this ambiguity by supporting single inheritance with interfaces.
Since the interface only has a method declaration 
and doesn't provide any implementation there will only be just one implementation of a specific method 
hence there would not be any ambiguity.
*/


//using interface , can do multiple inheritance in java


interface X
{
	public abstract void show();
}

interface Y
{
	public abstract void show();
}


class Z implements X,Y
{

	@Override
	public void show() {
		System.out.println("here we are defining show method");
		// in interface X and Y , we have just declare it, so no ambiguity issue
	}
	
	public static void main(String[] args) {
		Z obj = new Z();
		obj.show();
	}
		
}


