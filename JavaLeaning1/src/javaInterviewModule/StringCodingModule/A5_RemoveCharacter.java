package javaInterviewModule.StringCodingModule;
// How do you remove a given character from String? (solution)

public class A5_RemoveCharacter {

	public static void main(String[] args) {
		String str="Java";
		String s=removeChar(str,'a');
		System.out.println(s);
	}

	public static String removeChar(String str ,char c) 
	{
		String newS="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='v')
			{
				
			}
			else
			{
				newS=newS+str.charAt(i);
			}
		}
		
		
		return newS;
		
		
	}
}
