package dataTypeConversion;

public class DoubleToLongConversion {

	public static void main(String[] args) {
	
		
//1. explicit		
		double d = 129.34;		
		long f= (long)d;
		System.out.println(f); //129

//2. Math.round()		
		double db= 3421.56;
		long rnd= Math.round(db); 
		System.out.println(rnd); //3421
		
// longValue()	
		
		double bill= 3.14;
		Double obj = bill;
		long l = obj.longValue();
		System.out.println(l); //3
	}
}
