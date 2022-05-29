package capgeminiInterviewQuestions;

public class Demo1 {

	public static void gfg(String s)
	{
		System.out.println("String");
	}
	
	public static void gfg(Object s)
	{
		System.out.println("Object");
	}
	
	
	/*
	 * public static void gfg(Integer i)
	 *  {
	 *   System.out.println("String");
	 *   
	 *    }
	 */
	 
	
	
	public static void main(String[] args) {
		gfg(null);  // String
	}
	
}
