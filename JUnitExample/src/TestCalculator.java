import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class TestCalculator {

	
	
	public TestCalculator()
	{
		System.out.println(" constructor called");
	}
	
	
	@BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("@BeforeClass method will be executed before the JUnit test for"
                + "a Class starts");
    }


	@AfterClass
    public static void tearDownClass() throws Exception {
         System.out.println("@AfterClass method will be executed after JUnit test for"
                + "a Class Completed");
    }

	
	
	@Before
    public void setUp() {
        System.out.println("@Before method will execute before every JUnit4 test--------------------");
    }

	 
	
	@Test
	public void test() {
//		fail("Not yet implemented");
		System.out.println("Junit test case");
	}

	
	@Test
    public void testAdd() {
          Calculator calc = new Calculator();
           int val = calc.add(10,20);
           String s=Integer.toString(val);
           assertEquals("30",s);
    }

    @Test
    public void testMultiply() {
            Calculator calc = new Calculator();
            int val = calc.multiply(10,20,30);
            String s=Integer.toString(val);
            assertEquals("6000", s);
    }

	
	  @Test
	  public void testingconcat() 
	  { 
		  Calculator calc = new Calculator(); 
	 String s  = calc.concat("new");
	
	  assertEquals("previousnew", s);
	  }
	 
	  @After
	    public void tearDown() {
	        System.out.println("@After method will execute after every JUnit4 test-----------------------");
	    } 


	  
	//Some time we add test method in JUnit test class but hasn't implemented that is causing your build to fail	  
	 // you can avoid that problem by marking your test method as @Ignore in Junit4.
	  	  
	/*
	 * Well, from JUnit 4 onwards you can use @Ignore annotation to instruct JUnit
	 * runtime to not execute any particular test or disable any test
	 */

	 
	  @Ignore("Not yet implemented")
	    @Test
	    public void testGetAmount() {
	        System.out.println("getAmount");
	        fail("@Ignore method will not run by JUnit4");
	    }

	  
}
