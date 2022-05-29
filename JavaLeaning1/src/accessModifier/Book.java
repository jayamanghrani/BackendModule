package accessModifier;

public class Book {

	//public member and method
	public String isbn;	            
	public void printBook()          
	{		
	}
	
	
	// protected member and method
	protected String author;
	protected void modifyTemplate()
	{		
	}
	
	
	//default member and method
	int issuecount;
	void issueHistory()
	{
		
	}
	
	//private member and method
	private int countPages;
	private void countPages()
	{
		
	}
	
	
}


class UseBook
{
	
public UseBook()
{
	Book b1= new Book();
	b1.isbn="Isbn";
	b1.author="Author";
	b1.issuecount=0;
	/* b1.countPages */ /** private can't access */	
}


}