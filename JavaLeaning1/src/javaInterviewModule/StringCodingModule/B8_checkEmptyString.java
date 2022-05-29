package javaInterviewModule.StringCodingModule;

public class B8_checkEmptyString {

	public static void main(String[] args) {
		
	
		/* popular and faster way to check if String is empty or not
		is by checking its length like if String.length() = 0
		then String is empty, but this is also not null safe. */		
		//it will throw NullPointerException if String is null.
		
		
		/*There will be no null pointers in this case.  Both of these ways confirm that String is not null and empty.*/
		String nullString = null;
		String empty = new String();

		boolean test = "".equals(empty);  // true
		System.out.println(test);
		        
		boolean check = "".equals(nullString);    // false
		System.out.println(check);
		
		

	}
}
