package javaInterviewModule.StringCodingModule;

//Using recursion

public class C5_FindAllPermutationsOfString
{
	public static void main(String[] args)
	{
		
		 permutation("123");
		
		 String text = "iMac";
			
			System.out.println("word.substring(0, i)"+text.substring(0, text.indexOf('i')));
		
	}

	public static void permutation(String input) {
		permutation("", input);
		
	}
	
	private static void permutation(String perm, String word)
	{
		if (word.isEmpty())
		{ 
			System.err.println(perm + word);
		}
		else 
		{
			for (int i = 0; i < word.length(); i++) 

			{ 
				
				System.out.println("word -"+word);
				System.out.println("perm-"+perm);
				/*
				 * System.out.println("perm + word.charAt(i)-->"+perm + word.charAt(i));
				 * System.out.
				 * println("word.substring(0, i) + word.substring(i + 1, word.length()-->"+word.
				 * substring(0, i) + word.substring(i + 1, word.length()));
				 */
				
				System.out.println(" Calling perm("+perm + word.charAt(i)+","+ word.substring(0, i) +" "+ word.substring(i + 1, word.length())+" )");
				
				
				
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));

			
			}
		} 
	}

	
}
/*
 * If you remember the factorial problem you know that factorial is naturally
 * recursive i.e. factorial of n is nothing but n * factorial of n -1.
 * Similarly, permutations are also a recursive problem e.g. permutation of n
 * characters is nothing but fixing one character and calculating permutation of
 * n - 1 characters e.g. in the case of "xyz", you can fix "x" and calculate
 * permutation of "yz".
 */

/*
 * n order to calculate all permutations of a String, you need to repeat this
 * exercise for all characters one at a time. This is where for loop comes into
 * the picture. So, this solution uses both for loop and recursion to print all
 * permutations of a given String.
 */

/**
 * In the case of recursion, the most important question is the base case,
 * because that is responsible for stopping recursive calls. If you don't have a
 * base case then your program will eventually terminate with
 * java.lang.StackOverFlowError.
 */
