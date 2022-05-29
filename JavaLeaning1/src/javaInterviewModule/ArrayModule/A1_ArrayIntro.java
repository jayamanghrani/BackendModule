package javaInterviewModule.ArrayModule;

public class A1_ArrayIntro {

	public static void main(String[] args) {
		
		int[] ar; // recommended
		
		int []cr;  // not recommended
		
		int crrr[]; // not recommended
		
			
		
		String [] [] [] arr; // recommended
		
		String[] brr []; // not recommended

		
		
		
		int [] arr1,brr1;  //both arr and brr are array references 

		int arr2[],brr2;  //only arr is an array reference while brr is an integer variable.

		
		
		
		/* int[] arr3,[]brr3; */    //error  , agr , lg rha to [] nhi lgana h
		
		int [] arr3, brr3[];  // allowed , arr will be a 1 D array reference while brr will be a 2D array reference
		
		


		int arr4[ ],brr4[]; // allowed both arr and brr are array references

		
		

		
		
	}
	
	
}


// Arrays are index based collection of homogeneous type , always accessed using their index nos.

/**
 * They hold either primitives or object references, but the array itself will
 * always be an object.
 * 
 * 
 * int [] arr = new int[5];
 * 
 * arr will point to array obj which conatin 5 int
 * 
 * 
 */

/* Arrays kis class ke object hote h ? */

//They are always created dynamically--chaheye new lgao ya mat lgao

/* int [] arr = { ,,,,} ------object bn rha heap me*/


//They live in memory area called heap.


/* ************************************************************************************************
*/



//What We Should Use Arrays ?

/*
 * When we already know the number of elements to be stored, for example ,
 * weekdays in a week
 */

//Declaring Array of primitives


/**
 * int[] key ----recommended 
 * 
 * key is a reference to an array obj containing array of integers.
 * 
 * 
 * int key [] ----not recommended
 */

//Declaring an array of non-primitives.

/*
 * Thread[] arr; ---Recommended
 * 
 * It is a reference to an array object containing references to Thread object
 * 
 */


