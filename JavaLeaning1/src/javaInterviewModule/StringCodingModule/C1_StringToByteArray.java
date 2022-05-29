package javaInterviewModule.StringCodingModule;

public class C1_StringToByteArray
{
	public static void main(String[] args) {
		
	//byte array to String
		//wrong
		/*
		 * byte b=71; 
		 * String str= new String(b);  //error
		 */
		
		//right way is
		
		byte[] brr = new byte[]{71};
		String str = new String(brr);
		System.out.println(str);       //G
		

	// String to byte	
		
		byte[] val = str.getBytes();
		for(byte b:val)
		{
			System.out.println(b);   //71
		}
		
		
		
		System.out.println("---------------------------------");
		
		
		
		//Similarly for characters
		
		/*
		 * char c='a'; 
		 * String s = new String(c);  //error
		 */
		
		String sw = new String(new char[]{'a','b'});
		
		System.out.println(sw); 
		
		char[] ch =sw.toCharArray();
		
		for(char c :ch)
		{
			System.out.println(c);
		}
		
	}
}
