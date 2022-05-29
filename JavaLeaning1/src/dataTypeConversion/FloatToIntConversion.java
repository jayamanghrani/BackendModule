package dataTypeConversion;

public class FloatToIntConversion {

	
	public static void main(String[] args) {

		
// 1. Type casting		
		float fval =3.14f;		
		int value= (int)fval;    // 3
		
		int score = (int)3.99f; //3
		
		
		

//2. If we use Float obj instead of float primitive val
		float f = 3.99f;
		Float obj = f;
		int i= obj.intValue();
		
//3.Math.round()		
		int a= Math.round(3.99f); //4
		
		
	}
	
	
	
}
