package designPatterns;

/*Factory design pattern in Java one of the core design pattern which is used heavily not only in JDK 
 * but also in various Open Source framework such as Spring, Struts and Apache
 *  along with decorator design pattern in Java.
*/

/*Factory Design pattern is based on Encapsulation object oriented concept. 
*/

//The whole purpose of factory pattern is to allow them to create instance of a class without calling constructor.

//Factory patterns can also be used to hide information related to the creation of objects.

//Factory method pattern offers an alternative way of creating objects.

//We can use factory pattern where we have to create an object of any one of sub-classes 
//depending on the data provided

/*The new operator is often considered harmful as it scatters objects all over the application.
Over time it can become challenging to change an implementation because classes become tightly coupled.
*/



//Factory pattern can be used,

/*When a class does not know which class of objects needs to create. 

In programming language, you can use factory pattern where you have to create an object
of any one of sub-classes depending on the given data.
*/
public class A6_FactoryDesignPattern {

}




/*Factory Design patterns usage in Java SE and Java EE

Factory method (recognizeable by creational methods returning a concrete type)

java.lang.Object#toString() (overrideable in all subclasses)
java.lang.Class#newInstance()
java.lang.Integer#valueOf(String) (also on Boolean, Byte, Character, Short, Long, Float and Double) 
java.lang.Class#forName()
java.lang.reflect.Array#newInstance()
java.lang.reflect.Constructor#newInstance() 
*/

