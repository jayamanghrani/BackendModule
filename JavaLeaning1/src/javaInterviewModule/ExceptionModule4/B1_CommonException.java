package javaInterviewModule.ExceptionModule4;

import java.util.ArrayList;
import java.util.Iterator;

public class B1_CommonException {

	
	public static void main(String[] args) {
		
		
		Thread th=new Thread(); 
		 //th.setPriority(11);  //IllegalArgumentException
		
/* ************************************************************************************		*/		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		
		Iterator<Integer> it = num.iterator();
		
		while (it.hasNext()) /** hasNext() check krke btata h next value h ki nhi, iterator k aage nhi bdhata */
		{
			/* it.remove(); *///Exception in thread "main" java.lang.IllegalStateException
			
			
			Integer obj = it.next();			
			System.out.println(obj);
			if(obj==10)
			it.remove();   // if this will call at first line , give exception
			
		}
		
		System.out.println("After removing"+num);
	}
	
/* ************************************************************************************		*/		
	
	
}


//IllegalArgumentException --java.lang.IllegalArgumentException is thrown to specify 
//that a method has passed illegal or inappropriate arguments

/*For ex:
Thread thread=new Thread();
th.setPriority(11);
Thread priority can't be more than 10

*/ 


//IllegalStateException
/*
 * An IllegalStateException signals that a our method has been invoked at inappropriate time.
 */




