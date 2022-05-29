package javaInterviewModule.ExceptionModule4;

import java.util.ArrayList;

public class A9_CommonExceptions {

	public static void main(String[] args) {
		
		
		/* ArrayIndexOutOfBoundsException comes in array*/		
		String[] season = {"Spring", "Summer"}; 
		System.out.println(season[5]); 
		
//******************************************************************************************		
		
		
		
		/* IndexOutOfBoundsException   comes in collection*/	
		ArrayList<String> exams = new ArrayList<>(); 
		exams.add("Java");  
		exams.add("Oracle"); 
		System.out.println(exams.get(4));
		
//******************************************************************************************		
		
		/*ClassCastException at Run time*/
		
		ArrayList<Ink> inks = new ArrayList<Ink>();
		inks.add(new RedInk());
		inks.add(new BlackInk()); 
	
		Ink ink = (BlackInk) inks.get(0); //Exception in thread "main" java.lang.ClassCastException
		/*RuntimeException but Compiler has no issues on this line - BlankInk is is Ink*/
		
		// how to avoid this?
		/* Using instanceof operator */
				
			
		 if((inks.get(0)) instanceof BlackInk) 
		 { 
			 Ink in = (BlackInk)inks.get(0);
		 }
				 
		
		
//******************************************************************************************		
	
		
	
		
		/*ClassCastException at compile time*/
		ArrayList<RedInk> cink = new ArrayList<RedInk>();
		cink.add(new RedInk());

		/* Ink in = (BlackInk)cink.get(0); */ //Cannot cast from RedInk to BlackInk beacuse dono me koi relation nhi h
									// yaha RedInk ya RedInk ki deried aa sakti h
		
		

		
		// let's understant this 
		
		/* Animal is interface , Cow and Tiger are derived class */
		
		/*
		 * Animal a = new Cow();----correct 
		 * Animal a = new Tiger();---correct 
		 * Tiger t= new Cow();--------------not correct
		 * 
		 */		
	
		
	
	}
	
}

class Ink{}
class RedInk extends Ink{}
class BlackInk extends Ink{}


//1. ArrayIndexOutOfBoundsException and IndexOutOfBoundsException

/** ArrayIndexOutOfBoundsException */
/*
 *  is thrown when a piece of code tries to access an array out of its bounds
 */

/**IndexOutOfBoundsException */
/*
 * Collection me aati h 
 * is thrown when a piece of code tries to access a list, like an ArrayList,
 * using an illegal index.
 */
	

/**ClassCastException */

/*
 * When we cast an object to that class/interface which is not part of its inheritance
 * chain.
 */

/* Imp points regarding type casting of reference ---refer screenshot*/



