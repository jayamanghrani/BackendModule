package accessModifier2;
import accessModifier.Book;

public class StoryBook extends Book{

	public StoryBook()
	{
		
		author="ABC";    // we can direct access members of the book , since we are doing inheritance by extends
		modifyTemplate();   
		printBook();
		
		Book book = new Book(); // book class is public , can create obj 
		book.isbn="hh";   // since this public , it will compile
		
/*		book.author="ABC";    // it will not compile, author protected h and package diff h ,can't access by object , extends kar rhe to only implicit acess kar sakte h
		book.modifyTemplate();   
		
*/		


	/* issueHistory(); */  // change issueHistory() visibility to protected 
		
		
	
	}
	
}
