package collectionInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array {
	
	
	public static void main(String[] args)
	{
		System.out.println(" Facilities in Arrays");  
		
		String[] arr= new String[5];
		arr[0]="jaya";// add in array
		arr[1]="lata";
		 
		System.out.println("Get element in array --"+arr[0]); // get an element
		
		System.out.println("remove by our own logic ");
		/*Naive or Basic approach (Using another array): The basic approach includes finding the element
		at the specified index and then removing that element. The rest of the elements are copied into a new array.
		This would lead to an array of size one less than the original array.*/
	
		System.out.println(arr.length); // 5 because , we have given fixed size
		
		
		System.out.println("******************************************************"); 	
		
		System.out.println("Collections"); 		
		

		
	}
	
	

}
