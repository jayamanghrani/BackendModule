package javaInterviewModule.JavaBasicsmodule1;

public class N6_CommandLineArg {

	
	public static void main(String[] args) {        // java N6_CommandLineArg Jaya Manghrani TCS-devel-oper
		
		String firstname= args[0];
		String lastname= args[1];
		String Role= args[2];
		
		System.out.println("Name:"+firstname+" "+lastname+" "+Role);
	}
	
}
 

//What are cmd line Arguments ??

/*
 * if any input value is passed through the cmd prompt at the time of running of
 * the prog, it is known as cmd line arg.
 */
//Special pt-
/*
 * 1. No restiction on no.(any no. of arguments)
 *  2. values passed as String obj.
 *  
 */



//Eclipse command line arguments
/*
 * Click on Run -> Run Configurations 
 * Click on Arguments tab In Program
 * Arguments section ,
 *  Enter your arguments. Click Apply
 */





//Interview questions--

//1. Is args an array?
/* No , obj ka array nhi bnta , array references ka bnta h. */
		
		
//2. what exactly is args?
/*
 * it is a reference to an array of references to String object.
 */		
		
		
/*	ex. java Test "Sunday" "Monday" "Tuesday"	
*/		
/*
 * args ----[0,       1,        2]
             |        |       | 
             Sunday Monday Tuesday             -----------String object
             
             
             
             
         [] - represents that it is refrence of array    
        
        
        String args ---obj references 
        String [] args --- array references
        
             
             int [] arr - arr is the reference to an array of int
             
 */


//3. can we give any other name to args?
    /* yes,  args represent - arguments   */


//4. what is diff b/w following stmt
	/*
	 *A -- java Test hello world 
	 *B -- java Test "hello world"
	 */

	/*
	 * In A --args[0]- hello , args[1]- world
	 */
	/*
	 * In B --args[0]- hello world
	 */



