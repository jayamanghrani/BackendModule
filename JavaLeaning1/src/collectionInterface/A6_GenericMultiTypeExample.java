package collectionInterface;

public class A6_GenericMultiTypeExample<T,U> {
	
T obj1;
U obj2;

public A6_GenericMultiTypeExample(T obj1, U obj2) {
	this.obj1=obj1;
	this.obj2=obj2;
}
	
  public void printMultiObj()
  {
	 System.out.println(obj1);
	 System.out.println(obj2);
  }

	public static void main(String[] args)
	{
		 A6_GenericMultiTypeExample<String,Integer> mulObj= new A6_GenericMultiTypeExample<String, Integer>("Jaya", 1997);
		
		 mulObj.printMultiObj();
	}
	
}
