package smallProgrames.copy2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindromes {
	
	public static void main(String[] args)
	{
		
		List<String> palindrone=Arrays.asList("LOL", "MADAM","JAYA");
		List<String> result= CheckPalindromes.check(palindrone);
		
		System.out.println("palindromes are:"+result);
		
	}

}


 class CheckPalindromes
{
	public static List<String> check(List<String> Palindromes)
	{
		
		ArrayList<String> result= new ArrayList<>();
		String rev="";
		
		for(int i=0;i<Palindromes.size(); i++)
		{
			String real=Palindromes.get(i);// LOL
			
			for(int j=real.length()-1;j>=0;j--) //(j=2)
			{
				rev=rev+real.charAt(j);
			}
			
			if(real.equals(rev))
			
			{
				result.add(rev);
			}
			
			rev="";
		}
		
		List<String> list =(List<String>)result;
		
		return list;
		
		
		
	}
	

}
