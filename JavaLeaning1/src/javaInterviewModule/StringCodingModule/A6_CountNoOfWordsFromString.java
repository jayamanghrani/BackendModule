package javaInterviewModule.StringCodingModule;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A6_CountNoOfWordsFromString {

	public static void main(String[] args)
	{
		String str="Java is a programming language and Python is a general purpose lang";
		
		int a=wordCountUsingReguralExpression(str);
		System.out.println("wordCountUsingReguralExpression -"+a);
		
		
		  int b=wordCountWithoutReguralExpression(str); System.out.
		 println("wordCountWithoutReguralExpression-" +b);
		 	}

	
	  public static int wordCountWithoutReguralExpression(String str) {
	  
		  String[] words = str.split("\\W");
		  
		  HashMap<String, Integer> map = new HashMap<String, Integer>();
		  
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
		  
		  // iterate
		  
		  Set<Map.Entry<String,Integer>> set = map.entrySet();
		  int count=0;
		  
		  for(Map.Entry<String,Integer> m: set)
		  {
			  count =count+m.getValue();
		  }
		  
		  
		  
	  return count;
	  
	  
	  }
	 

	public static int wordCountUsingReguralExpression(String str)
	{
		if(str=="null")
		return 0;
		
		String input=str.trim();
		
		int count =input.isEmpty() ? 0: input.split("\s").length;
		
		return count;
	}
}
