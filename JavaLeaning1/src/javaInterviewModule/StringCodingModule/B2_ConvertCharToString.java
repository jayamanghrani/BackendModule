package javaInterviewModule.StringCodingModule;

public class B2_ConvertCharToString {

	public static void main(String[] args) {
		
		char c='J';
		String val= Character.toString(c);
		System.out.println(val);
		
		
		char c1= 'A';
		String str= ""+c1;
		System.out.println(str);
		
		
		char ch = 'U';
		String s= new String(new char[]{ch});

		System.out.println(s);
		
		
		
		char ch2='X';
		String valueOfchar = String.valueOf(ch2);
		System.out.println(valueOfchar);
	}
	
	
}
