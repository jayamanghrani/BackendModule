package smallProgrames.copy3;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String reversename=UseReverseString.reverse("jaya");
		System.out.println(reversename);
		
	}

}

class UseReverseString
{
	public static String reverse(String name)
	{
		
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		
		
		return rev;
		
	}
	

}
