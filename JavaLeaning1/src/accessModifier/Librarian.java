package accessModifier;

public class Librarian {

	
	public Librarian()
	{
		
		Book book= new Book();  
		
		book.isbn="abd";  // public are accessible in same package, but will access by object only
				
		book.author = "ABC";  // protected are accessible in same package, but will access by object only
		book.modifyTemplate();
		
		
		book.issuecount=2; // can access default members in same pkg, but will access by object only
		 book.issueHistory();
		
	}
	
}
