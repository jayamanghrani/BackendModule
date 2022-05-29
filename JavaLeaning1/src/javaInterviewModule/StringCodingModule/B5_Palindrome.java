package javaInterviewModule.StringCodingModule;

public class B5_Palindrome {

	public static void main(String[] args) {
		
		//Palindome with String
		String str= "madam";
		String str2= checkStringPalindrome(str);
		 if (str.equalsIgnoreCase(str2))
		 {
			 System.out.println(str+" is a palindrome");
		 }
		 else
		 {
			 System.out.println("Not a palindrome");
		 }

		 
		 
		 
		 // Palindrome with Integers
		 
		 int num = 123;
		 
		 if(isPalindrome(num)){
	            System.out.println("Number : " + num
	                   + " is a palindrome");
	        }else{
	            System.out.println("Number : " + num
	                   + " is not a palindrome");
	        }      
		 
		 
		 
		 
		 
		
	}
	
	
public static String checkStringPalindrome(String str) {
		
		if(str!=null)
		{
			String reverse="";
			int len= str.length();
			
			for(int i=len-1 ;i>=0; i--)
			{
				reverse=reverse+str.charAt(i);								
			}	
			return reverse;
		}
						
		return null;
	}
	
	

public static boolean isPalindrome(int num)
{
	int p = num;
	int reverse= 0;
	
	while(p!=0)
	{
		int reminder=p%10;
		
		reverse =reverse* 10 +reminder;
		p= p/10;
	}
	
	if (num==reverse)
	{
		return true;
	}
	
	return false;

}

}
