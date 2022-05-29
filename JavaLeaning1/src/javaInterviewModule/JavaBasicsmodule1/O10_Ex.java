package javaInterviewModule.JavaBasicsmodule1;

public class O10_Ex {

	int count;
	
	public void N10_Ex()
	{
		count=4;
	}
	
	public static void main(String[] args) {
		
		O10_Ex obj = new O10_Ex();
		/* obj.count; */ // insert "VariableDeclarators" to complete LocalVariableDeclaration
		
		int c = obj.count;
		System.out.println(c);
	}
}
