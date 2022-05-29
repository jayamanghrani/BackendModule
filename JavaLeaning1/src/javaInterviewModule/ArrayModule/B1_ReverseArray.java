package javaInterviewModule.ArrayModule;

import java.util.Arrays;

// Reverse Array

public class B1_ReverseArray 
{
	public static void main(String[] args) 
	{
		
		String[] names= {"John, Jammy,Tommy"};
		
		System.out.println("original array "+Arrays.toString(names));
		
		reverseArray(names);
		
		System.out.println("revrsed array "+Arrays.toString(names));
		
		
	}

	private static void reverseArray(String[] array) 
	{
		if(array==null || array.length<2)
		{
			return;
		}		
		
		for(int i=0; i<array.length/2 ;i++)
		{
			String temp = array[i];      //john
			
			array[i]= array[array.length-1-i]; // tommy
			
			array[array.length-1-i]= temp; // john
			
		}
	
	}
	
}
