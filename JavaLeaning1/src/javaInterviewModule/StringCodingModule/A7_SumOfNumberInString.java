package javaInterviewModule.StringCodingModule;

public class A7_SumOfNumberInString
{
	public static void main(String[] args) {
		
		
		String str= "12abc20yz68a";
		
	
		int s=calculateSum(str);
		System.out.println(s);
	}
	
	
	
	
	
	
	public static int calculateSum(String str)
	
	{
		String temp="";
		int sum=0;
		
		int len = str.length();
		
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			
			if(Character.isDigit(ch))
			{				
				temp=temp+ch;				
			}
			
			else
			{
				if(temp==" ")
				{					
				}
				else
				{					
				sum =sum+Integer.parseInt(temp.trim());	
				System.out.println("sum-"+sum);
				temp=" ";
				}
			
			}			
	
		}
		
		char lastchar= str.charAt(len-1);
		
		if(Character.isDigit(lastchar))
		{
			sum =sum+Integer.parseInt(temp.trim());	
		}
				
		
		return sum;
	}		
}
	

