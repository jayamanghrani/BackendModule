package dataTypeConversion;

public class StringConversion {

	public static void main(String[] args) {
		
//1. String to Float
		
/*		a)Float.parseFloat(s);
		b)Float.valueOf(s);
		c)new Float() constructor */
		
//Float to String
		
/*		a) String concatenation
		b) Float.toString(f);
		c) String.valueOf(f);*/
		
		
		String s= "3.14";
		System.out.println(String.valueOf(4)); //"4"
		
		float f =Float.valueOf(s);
		System.out.println(f);  //3.14
		
		
		long l = Long.valueOf(s);
		System.out.println(l); //Exception
		
		
	}
}
