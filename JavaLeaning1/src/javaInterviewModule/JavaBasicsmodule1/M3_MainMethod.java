package javaInterviewModule.JavaBasicsmodule1;

public class M3_MainMethod {

	
 strictfp public static void main(String[] bhopal)
	{
		System.out.println(bhopal.length);  // 0 array pass hua h JVM ki taraf se jiski length 0;
	}
	
}

// Main Method

/*
 * execution of a java prog always starts from main method.
 * 
 * code can compile without main method, compilation se main ka koi matlab nhi h
 * 
 * Ex.  
 * class  Sample
 * {
 * 
 * }
 * 
 * compile - yes
 * run - error (Main method not found)
 * 
 * 
 */

// Main prototype

/*
 * public static void main(String[] args)
 * 
 * public -- access modifier 
 * static- non access modifier
 * void -- return type
 * main- main method
 * String - class 
 * args- reference
 * 
 * 
 */

// Why main is always public
/*
 * So JVM can call main() from anywhere. Even from outside the package.
 */


// why main static?
/*
 * obj creation in java is a hectic process. and JVM just has to call main()
 * only once. Hence to reduce overhead the JVM forces programmer to make main
 * method as static
 * 
 * what is promblem in creating obj;
 * 
 * hectic process- 
 * 1.class load- our class and super
 * 2.object ko space milegi
 * 3.constructor call
 * 
 * 
 */

//why main return type is void?
/*
 * beacuse JVM doesn't except method main() to return anything
 */


//Why main() always takes String[] as argument?
/*
 * because JVM hmesha main ko argument pass krta h ya hmm dete h console se ,
 * agr hmm na de to empty array milta h
 * proff -above ex. 
 * 
 * main is always parameterized, and that's why we can pass argument by compile line argument
 * 
 */

 // if we make main method private , will our code compile?
	/*
	 * yes , code will compile but it will not run
	 */



//What JVM allowed?

	/*
	 * public static void main(String[] args)
	 *  static public void main(String[] args)
	 */



// can main method be final -- Yes (final lgane se overriding nhi kr sakte,
									//main method ki to overriding hmm nhi krte to final lga sakte h )





// can main method be abstract - abstract and static galat combination h , code compile nhi hoga

      
//Will JVM accept below cases--??
									/*
									 * public static void main(String str) - No   
									 */
									/*
									 * public void main(String[] str) - No 
									 */
									/*
									 * static public void main(String[] str)-- yes
									 */
									/*
									 * public static int main(String[] str) -- no
									 */
									/*
									 * public strictfp static void main(String[] str) --yes
									 */
									/*
									 * public static final void Main(String[] str) - no
									 */
									/*
									 * public static final void main(String[] str) - yes
									 */
									/* public static void main(String ...args) - yes */




