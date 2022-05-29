package javaInterviewModule.JavaBasicsmodule1;


//Does main() method get inherited? ---- yes 


class B 
{
public static void main(String[] args) {
		
		System.out.println("Parent main called");
	}
}


public class M6_mainExample extends B
{
public static void main(String[] args) {                 
		
	/* super.main(args); */  // Cannot use super in a static context
	
	 B.main(args); 
	 System.out.println("child main called");
	}
	
}




// es class me kitne byte code  - 2 (M6_mainExample.class , B.class)
/*
 * when we will run class M6_mainExample --- output (Parent main called
 *  when we will run class B --- output (Parent main called
 * 
 * jab B ko main nhi milega to A se inherit kr lega 
 */


// Method hiding
/*
 * When we redefine static in child class , we will not say this is overridiing,
 * this is method hiding.
 */