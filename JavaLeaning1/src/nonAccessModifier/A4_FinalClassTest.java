package nonAccessModifier;

public class A4_FinalClassTest {

	private final StringBuilder sb = new StringBuilder("Sa");
	

	
	public A4_FinalClassTest()
	{
		sb.append("chin");  //allowed
		
		System.out.println(sb);
	}



	public static void main(String[] args) {
	
		A4_FinalClassTest obj = new A4_FinalClassTest();
		
	}
}

//StringBuilder is declared as  final , the how can we change it?

/*We have written final with reference.

when we are appending , reference will point to same object ,so no issues

stringbuilder  has capcity to extends, it is mutable.

Therefore it is allowed, even for final variables.*/

