package javaInterviewModule.StringCodingModule;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A3_FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		char c=findFirstNonRepeatingCharacter("swiss");
		System.out.println("FirstNonRepeating character is- "+c);
		
	}
	public static char findFirstNonRepeatingCharacter(String str)
	{
		char[] ch=str.toCharArray();
		
		LinkedHashMap<Character, Integer> linkedmap =new LinkedHashMap<Character, Integer>();
		
		for(Character c:ch)
		{
			if(linkedmap.containsKey(c))
			{
				linkedmap.put(c, linkedmap.get(c)+1);
			}
			else
			{
				linkedmap.put(c, 1);
			}
		}
		
		
		Set<Map.Entry<Character, Integer>> set= linkedmap.entrySet();
		
		for(Map.Entry<Character, Integer> e :set)	
		{
			if(e.getValue()==1)
			{
				return e.getKey();
			}
			
		}
		throw new RuntimeException("didn't find any non repeated Character");

		
	}
}
