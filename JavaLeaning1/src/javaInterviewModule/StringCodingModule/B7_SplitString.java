package javaInterviewModule.StringCodingModule;

import java.util.ArrayList;
import java.util.Arrays;

public class B7_SplitString {

	public static void main(String[] args) {
		
		// You can use the split() method to split a  String where words are separated by comma.
		String languages = " Java,JavaScript,C++,Python,Ruby,Scala ";	
		
		/*  splitting String by comma, it will return array*/
        String[] array = languages.split(",");
		
        /* if you want, you can convert array to ArraList as shown below*/
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));        
        System.out.println(list);
        
        
        
        // trim will remove white spaces from first and last
        /*  splitting String by comma, it will return array*/
      String[] trimval= languages.trim().split(",");
        System.out.println(Arrays.toString(trimval));
        
        
        
	}
	
	
	
}
