package oops;

public class A8_DiffbtwAbstarctandInterface {

}



 //  Abstract												          Interface

/*			                                          |   Java interface can extend multiple interface 
If you choose abstract class over interface			  |	
than you lost your chance to extend another class	  |
													  |	also Java class can implement multiple interfaces,
										              |    Which means interface can provide more Polymorphism support 
										              |   than abstract class 
										              |										              |  
One more general rule of when to use abstract class	  |									                 
 is to find out whether a certain class will form     |
  a IS-A hierarchy									  |	              |   
										              |   CAN-DO-THIS hierarchy.
Ex- Shape has area                                    |   Interface generally define capability e.g. Runnable can run(), 
                                                      |   Callable can call(), Displayable can display()
Circle , triangle is a Shape						  |				                 
										              |   
										              |   if you are going to create classes which can do thinks like, 
										              |   can fly, you can use interface Flyable instead of abstract class.
										              |   
										              |
										              |9) Using interface also help while implementing Dependency Injection design pattern 
										              |   and makes testing easy. Many mock testing framework utilize this behavior.
										              |
										              |   
										              |
										              |Visibility of member--
Visibility of member--								  |		    Strictly public    , From java 9 private are allowed          
can be public , private , default or protected		  |							                 
										              |   
										              |   
										              |    
										                 
*/										                 