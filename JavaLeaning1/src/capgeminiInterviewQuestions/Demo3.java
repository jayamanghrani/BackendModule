package capgeminiInterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo3 {

	
	public static void main(String[] args) {
		
		Object i = new ArrayList().iterator();
		
		System.out.println((i instanceof List)+",");
		System.out.println((i instanceof Iterator)+",");
		System.out.println((i instanceof ListIterator)+",");
	}
	
}
