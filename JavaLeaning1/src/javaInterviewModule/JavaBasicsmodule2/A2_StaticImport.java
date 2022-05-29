package javaInterviewModule.JavaBasicsmodule2;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.parseInt;
import static java.lang.Math.PI;
import static java.lang.Math.*;
import static java.lang.System.out;
import static javaInterviewModule.JavaBasicsmodule2.A1_Package.FAMILY_COUNT;

public class A2_StaticImport {

	int MIN_VALUE= 5;
	
	public static void main(String[] args)
	{
		double PI = 5.16;
		
		System.out.println("max value :"+MAX_VALUE);
		out.println("PI value-- " + PI);        /** java pehle class me search krti h , nhi milta to pckage import krti h */ 
		out.println("Math ka pow-- "+pow(2, 3));  
		
		/* static methods */
		System.out.println(parseInt("12"));
		
	out.println("Family count is :"+FAMILY_COUNT); 	
	out.println("accessing static mem without static import "+A1_Package.NUM);
	
	
	/* System.out.println("max value :" + MIN_VALUE); */     /** error-  Cannot make a static reference to the non-static field MIN_VALUE */
	}
	
}


// Allow to import static members of class and use them.
/* This features introduced in java5 */
/* But remeber this is only for static members of any class */
/* It is not for classes . */
/*
 * We can apply static import stmt not only on static fields but also on static
 * methods in Java
 */




//Why we call println using out reference ?

/*println is non-static method,it is method of PrintStream class.

println ko call krne ke liye PrintStream ka obj chaheye.

out ---static reference of PrintStream class created using JINI technology , we can't create this type of  reference.
To create this type of refernce we will have to learn JINI technology, driver class for graphics 		
hmare pass drivers nhi h jisse hmm printStream ke obj se console pr print krva le*/

// java ne hmne out diya h but System class me kyo diya h 

/*
 * println ko call krne ke liye out hi chaheye , PrintStream ke normal obj se
 * nhi hoga.
 * 
 * since java doen't support global declaration, java is oop language h to out
 * reference ko kisi class ke andar hi dalna tha, esliye out ko System class me
 * dala.
 */


//Why out is static ?
/*
 * System ka obj nhi bnana pdta, direct call kr sakte.
 *  System.out
 */




