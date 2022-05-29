
public class Intro {

}

/*
 * Unit testing is one of the best development practices to follow and we must
 * try our best to incorporate that in our daily coding and development cycle.
 */

//1. What is JUnit?
/*
 * JUnit is a unit testing framework for the Java application. It allows you to
 * unit test your code at the method level. You can also use JUnit for
 * test-driven development e.g. first writing test and then writing actual code.
 * Most of the Java IDE like Eclipse, Netbeans and IntelliJ Idea provides
 * out-of-box JUnit integration for TDD. Even build tools like Maven, Ant, and
 * Gradle can run the JUnit test at compile and built time.
 */

//2. What is the difference between JUnit 3.X and JUnit 4.x?
/*
 * The main difference between JUnit 3 and JUnit 4 is annotation. Earlier you
 * need to start your method name as testXXX() but from JUnit 4.0 onwards you
 * can use @Test annotation, which removes this dependency to start your Junit
 * test methods as a test.
 */

//21. What is the difference between JUnit 4 and JUnit 5?
/*
 * The JUnit 5 is the latest version of JUnit also known as Jupiter. The minimum
 * JDK for JUnit 4 was JDK 5, while JUnit 5 requires at least JDK 8. Also,
 * the @Before, @BeforeClass, @After, and @AfterClass annotations are now more
 * readable than the
 * 
 * @BeforeEach, @BeforeAll, @AfterEach, and @AfterAll annotations.
 */




//9. Can you test a Java method for timeout using JUnit?
/*
 * Yes, JUnit provides a timeout parameter to @Test annotation which can be used
 * to instruct JUnit to pass or fail a test method based upon execution time.
 * For example, a JUnit test method annotated with @Test(timeout= 50) will be
 * failed it doesn't complete in 50 milliseconds (timeout is specified in
 * millisecond). This is the standard way to verify the SLA of a Java method.
 */



//10. What are some best practices you follow while writing code to make it more testable?
/*
 * Here are some of the best practices you can follow to make your code more
 * testable :
 * 
 * 1) Use interface instead of concrete class, this allows the tester to replace
 * actual class with Mock or Stub for testing purposes.
 * 
 * 2) Use Dependency injection, it makes it easy to test individual parts and
 * supply dependency from test configuration. You can create an actual object
 * which is dependent on the Mock and stub for testing. This also allows you to
 * test a class even if its dependency is not yet coded.
 * 
 * 3) Avoid static methods, they are difficult to test as they cannot be called
 * polymorhpically.
 */


//11.how do you test a method which doesn't return a value?
/*
 * Well, you can test a method even if it doesn't return a value by checking for
 * its side effects, for example, add() method of ArrayList doesn't return
 * anything but it has a side effect of the increasing size of Collection by 1,
 * so you can check whether add() is successful or not by checking the size() of
 * List before and after calling this method as shown below:
 */

/*@Test public void testListAdd() 
{
List<String> mylist = new ArrayList<>();
assertEquals(0, mylist.size());
collection.add("Java");
assertEquals(1, mylist.size());
collection.add("JUnit"); 
assertEquals(2, mylist.size());
}*/

/*
 * If a method doesn't return any value and doesn't have any side effects which
 * means it's not doing anything and doesn't require testing.
 */


//16. Can you test a private method using JUnit?
/*
 * Well, since private methods are not accessible outside the class they are
 * declared, it's not possible to test them using JUnit directly, but you can
 * use Reflection to make them accessible by calling setAccessible(true) before
 * testing. Another way to test private methods is via public methods, which
 * uses them. In general, testing the private method is also an indication that
 * those methods should be moved into another class to promote reusability.
 */

//17. What are some Unit testing libraries you know other than JUnit for Java programs?
/*
 * Java is very lucky to have many great unit testing libraries including JUnit.
 * Here are a couple of the most popular ones:
 *  Mockito which is a Mocking framework can be used with JUnit.
 *  PowerMock, similar to Mockito but also provide mocking of static methods.
 *  TestNG is similar to JUnit Spock
 * groovy-based unit testing framework for the Java application. 
 * 
 * Thanks to JUnit
 * Runner, you can use the Spock testing framework with Java IDEs as well.
 * 
 *  At a
 * bare minimum, you should JUnit and Mockito for writing unit tests in Java.
 */






