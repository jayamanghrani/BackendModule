package javaInterviewModule.StringCodingModule;

public class B6_Substring {

	public static void main(String[] args) {
		
// You can use substring() method to remove first
// and the last character from String in Java.
				
		String text = "iMac";
		
		System.out.println("word.substring(0, i)"+text.substring(0, text.indexOf('i')));
		String withoutFirstCharacter = text.substring(1); // index starts at zero
		String withoutLastCharacter = text.substring(0, text.length() - 1);
		System.out.println("without first character: " + withoutFirstCharacter);
		System.out.println("without last character: " + withoutLastCharacter);

		

// 2nd Example - You can use StringBuffer or StringBuilder to remove
// first or last character from String in Java
		String iStore = "iCloud";

		/* converting String to StringBuilder*/
		StringBuilder builder = new StringBuilder(iStore); 
		
		
		/* removing first character*/
				
		builder.deleteCharAt(iStore.length() - 1);
		builder.deleteCharAt(0);
		System.out.println( builder.toString());
			
	}
	
}
