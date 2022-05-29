package nonAccessModifier;


/*Normally we make a class static in Java when we want a single resource to be shared 
between all instances and normally we do this for utility classes*/

//Sometime interviewer ask  when to use Singleton vs Static Class in Java?

/*2) One more difference between Singleton and static is, ability to override.
Since static methods in Java cannot be overridden, they leads to inflexibility.
On the other hand, you can override methods defined in Singleton class by extending it.
*/

/*Many Dependency Injection frameworks manages Singleton quite well e.g. Spring,
which makes using them very easy.*/


/*3) Static classes are hard to mock and consequently hard to test then Singletons, 
which are pretty easy to mock and thus easy to test. 
It’s easier to write JUnit test for Singleton than static classes,
because you can pass mock object whenever Singleton is expected, e.g. into constructor or as method arguments.*/


public class A6_StaticExample {

}
