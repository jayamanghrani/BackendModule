package dataTypeConversion;

public class FloatToLongConverter {

	public static void main(String[] args) {
		
// 1. Autobox float into Float
		
		float f= 3.14f;		
		Float obj= f;		
		long longval = obj.longValue();		
		System.out.println("Using method"+longval);
		

//2.Explicit conversion

		float num = 444.33f;
		long l = (long)num;		
		System.out.println("using explicit"+l);
		

//Using Math.random
		float pt = 333.622f;
		long rounded = Math.round(pt); 
		System.out.println(rounded);
			
	}
	
}
