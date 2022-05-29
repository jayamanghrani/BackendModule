package javaInterviewModule.StringCodingModule;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//List of duplicates and their count characters from the given String? 

public class A2_DuplicateCharacter {

	public static void main(String[] args) {
		
		//printDuplicateCharacterInString("Java");
		printDuplicateCharacterInString("JavaProgramming");
	}
	
	public static void printDuplicateCharacterInString(String str)
	{
		char[] ch =str.toCharArray();
		
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		
		// Iterate
		
		Set<Map.Entry<Character, Integer>> set=map.entrySet();
		
		System.out.println("List of duplicates and their occurence");
		
		for(Map.Entry<Character, Integer> e :set)
		{
			if(e.getValue()>1)
			{
				System.out.println("Key:"+e.getKey() +" count-"+e.getValue());
			}
		}
	}
}

