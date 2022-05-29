package smallProgrames.copy;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		
		 //original string
        String str = "SonyTV";
        System.out.println("Original String: " + str);
		
		
        //reversed string using Stringbuffer
        String reverseStr = new StringBuffer(str).reverse().toString();
       // System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);
		
		
      //iterative method to reverse String in Java
        reverseStr = reverse(str);
        System.out.println("Reverse String in Java using Iteration: " + reverseStr);
        
      //iterative method to reverse String in Java using swapping
        reverseStr = reverseBySwapping(str);
        System.out.println("Reverse String in Java using Swapping: " + reverseStr);     
        
        str="abcd";
        
      //recursive method to reverse String in Java
        reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " + reverseStr);
        
        
        
	}
	
	
	public static String reverseBySwapping(String str)
	{
		StringBuilder sb = new StringBuilder();
		char[] ch= str.toCharArray();
		
		int len = ch.length;
		int midVal = (ch.length+1)/2;
		
		
		
		for (int i = 0 ; i <=midVal;i++){
			char temp = ch[i];
			ch[i] = ch[len-i-1];
			ch[len-i-1] = temp;
			
		
		}
		
		for (int i = 0; i<=ch.length-i;i++){
			sb.append(ch[i]);
		}
		
		return sb.toString();
	}
	
	
	
	public static String reverse(String str)
	{
		StringBuilder sb = new StringBuilder();
		
		char[] ch= str.toCharArray();
		
		int len = ch.length;
		for(int i=len-1;i>=0;i--)
		{
			sb.append(ch[i]);			
		}
		
		return sb.toString();
	
		
	}
	
	public static String reverseRecursively(String str) {
		System.out.println("Now string is "+str);

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        System.out.println(str.substring(1));
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(0));
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
	
}
