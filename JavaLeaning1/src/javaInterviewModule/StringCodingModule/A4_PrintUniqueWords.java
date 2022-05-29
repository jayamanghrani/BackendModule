package javaInterviewModule.StringCodingModule;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A4_PrintUniqueWords 
{
	public static void main(String[] args)
	{
		String str= "Java is great.Python is also great";
		
		PrintUniqueWords(str); // Java python also
		
		
	}

	public static void PrintUniqueWords(String str)
	{
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		String[] words = str.split("\\W");
		
	
		for(String word :words)
		{
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}
			else
			{
				map.put(word, 1);
				
			}
		}
		
		//Iterate
		
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		
		for(Map.Entry<String, Integer> s: set)
		{
			if(s.getValue()==1)
			{
				System.out.println(s.getKey());
			}
			
		}
	}	
}
